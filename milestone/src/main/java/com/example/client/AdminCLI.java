package com.example.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import com.example.server.Server;

public class AdminCLI {

    private static final String FILENAME = "rsrc/products.json";

    /**
     * A CLI Menu that loops and reads commands from the user
     * Command options are Update, Return, and Exit
     * @param args Program arguments
     */
    public static void main(String[] args) {
        System.out.println("\nYou are logged in as an admin\n");

        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = true;
        while (loggedIn) {
            System.out.println("Choose a command:");
            System.out.print("(U)pdate | (R)eturn | (E)xit | > ");
            char command = scanner.nextLine().charAt(0);
            System.out.println();
            switch (command) {
                case 'U': update();
                break;
                case 'R': fetch();
                break;
                case 'E': loggedIn = exit();
                break;
                default: continue;
            }
            System.out.println();
        }

        scanner.close();
    }

    /**
     * Update command. Sends a json string of Product objects to the Server to add to inventory
     */
    private static void update() {
        System.out.println("Updating Store Front Application");
        try {
            Socket clientSocket = new Socket(Server.HOST, Server.PORT);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String json = "U\n";
            Scanner scanner = new Scanner(new File(FILENAME));
            while (scanner.hasNextLine()) {
                json += scanner.nextLine();
            }

            out.println(json);
            System.out.println(in.readLine());

            out.close();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Unable to connect to Server");
        }
    }

    /**
     * Return command. Sends a request to the server querying for all products currently in inventory
     */
    private static void fetch() {
        System.out.println("Returning Store Front Application Inventory");
        try {
            Socket clientSocket = new Socket(Server.HOST, Server.PORT);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("R");
            String json = in.readLine();
            System.out.println(json);

            out.close();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Unable to connect to Server");
        }
    }

    /**
     * Exit command. Shuts down the server and terminates this program
     * @return False always
     */
    private static boolean exit() {
        try {
            Socket clientSocket = new Socket(Server.HOST, Server.PORT);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            out.println("E");
            String response = in.readLine();
            System.out.println(response);

            out.close();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            System.out.println("Unable to connect to Server");
        }
        System.out.println("Goodbye");
        return false;
    }
    
}
