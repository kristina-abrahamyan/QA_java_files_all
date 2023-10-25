package Tue_24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws CustomExceptions {
        String fileName = "C:\\Users\\User\\IdeaProjects\\untitled\\src\\Tue_24\\newFile.txt";

        writingFile(fileName);
        readingFile(fileName);
    }

    private static void readingFile(String fileName) throws CustomExceptions {

        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);

            String line;

            while (bf.ready()){
                line = bf.readLine();
                System.out.println(line);
            }
            bf.close();
            fr.close();

        } catch (IOException e){
            throw new CustomExceptions(e.getMessage());
        } finally {
            System.out.println("No issues.");
        }
    }

    private static void writingFile (String fileName) {
        try{
            FileWriter fr = new FileWriter(fileName);
            BufferedWriter bf = new BufferedWriter(fr);

            bf.write("Hello.");
            bf.close();
            fr.close();

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
