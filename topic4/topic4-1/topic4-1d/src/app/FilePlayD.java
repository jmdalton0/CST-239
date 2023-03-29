package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePlayD {
    public static void main(String[] args) throws IOException {
        System.out.println();

        try {
            copyFile("InUsers.txt", "OutUsers.txt");
            System.out.println("File was copied successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File could not be opened.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File IO error.");
        }
    }

    private static void copyFile(String inFile, String outFile)
        throws FileNotFoundException, IOException
    {
        BufferedReader in = new BufferedReader(new FileReader(inFile));
        BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
        String line;
        while((line = in.readLine()) != null) {
            String[] tokens = line.split("\\|");
            out.write(String.format("Name is %s %s of age %s\n", tokens[0], tokens[1], tokens[2]));
        }
        in.close();
        out.close();
    }
 
}
