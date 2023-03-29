package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePlayC {

    public static void main(String[] args) throws IOException {
        System.out.println();
        int err = copyFile("InUsers.txt", "OutUsers.txt");

        switch(err) {
            case 0:
                System.out.println("File was copied successfully.");
                break;
            case -1:
                System.out.println("File could not be opened.");
                break;
            case -2:
                System.out.println("File IO error.");
                break;
        }
    }

    private static int copyFile(String inFile, String outFile) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
            String line;
            while((line = in.readLine()) != null) {
                String[] tokens = line.split("\\|");
                out.write(String.format("Name is %s %s of age %s\n", tokens[0], tokens[1], tokens[2]));
            }
            in.close();
            out.close();
            return 0;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -2;
        }
    }
    
}


