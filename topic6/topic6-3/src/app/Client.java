package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import app.Client;

public class Client {
    
    public static void main(String[] args) {
        System.out.println();
        Client client = new Client();
        client.start("127.0.0.1", 8080);
    }
            
    public void start(String ip, int port) {
        try {
            Socket clientSocket = new Socket(ip, port);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            for (int i = 0; i < 10; i++) {
                out.println("Hello from client " + i);
                System.out.println("Server said: " + in.readLine());
                Thread.sleep(5000);
            }

            out.println(".");
            System.out.println("Server said: " + in.readLine());

            out.close();
            in.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
