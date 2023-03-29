package com.example.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import com.example.model.Product;
import com.example.store.Inventory;

public class Server extends Thread {

    public static final String HOST = "localhost";
    public static final int PORT = 8080;

    private Inventory inventory;
    private PrintWriter out;
    private BufferedReader in;
    private boolean listen;

    /**
     * Default Constructor
     */
    public Server() {
        this.inventory = null;
        this.listen = true;
    }

    /**
     * Parameterized Constructor
     * @param inventory A reference to the inventory object used by the store front
     */
    public Server(Inventory inventory) {
        this.inventory = inventory;
        this.listen = true;
    }

    /**
     * The server is started in a new thread and listens for client requests
     */
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            while(listen) {
                Socket clientSocket = serverSocket.accept();

                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String command = in.readLine();
                if (command.equals("U")) {
                    update();
                } else if (command.equals("R")) {
                    fetch();
                } else if (command.equals("E")) {
                    exit();
                } else {
                    out.println("Invalid Request");
                }

                out.close();
                in.close();
                clientSocket.close();
            }
            serverSocket.close();
        } catch (IOException e) {
            out.println("Error: malformed json");
        }
    }

    /**
     * If a U command is received, the Server reads in a provided JSON, converts it to Product objects, and adds them to inventory
     * @throws IOException
     */
    private void update() throws IOException {
        Serializer serializer = new Serializer();
        String json = in.readLine();
        for (Product product : serializer.fromJSON(json)) {
            inventory.addProduct(product);
        }
        out.println("Inventory Updated");
    }

    /**
     * If a R command is received, the Server converts the current inventory to JSON and sends it to the client
     * @throws IOException
     */
    private void fetch() throws IOException {
        ArrayList<Product> products = inventory.getProducts();
        Serializer serializer = new Serializer();
        String json = serializer.toJSON(products);
        out.println(json);
    }

    /**
     * If a E command is received, the Server quits
     */
    private void exit() {
        listen = false;
        out.println("Server Shutting Down");
    }

}
