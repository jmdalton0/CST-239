package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import app.Server;

public class Server {

    public static void main(String[] args) {
        System.out.println();
        Server server = new Server();
        server.start(8080);
    }

    public void start(int port) {
        try {
            System.out.println("Server listening on port 8080...");
            ServerSocket serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();

            System.out.println("Received a Client connection on port " + clientSocket.getLocalPort());
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


            String inLine;
            while((inLine = in.readLine()) != null) {
                System.out.println("Client said: " + inLine);
                if (inLine.equals(".")) {
                    out.println("QUIT");
                } else {
                    out.println("OK");
                }
            }

            System.out.println("Shutting down");
            out.close();
            in.close();
            serverSocket.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
