package readtxt;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.FileInputStream;



public class Readd{

    public static void main(String[] args) throws IOException {
        Path south = Paths.get("src/main/resources/south.txt");
        System.out.println(south.getFileName().toString());
        System.out.println(south.toFile().exists());
        System.out.println(south.toFile().length());

    }


        public int countWordLongerThanFive(){
        int count = 0;
            Path south;
            south = Paths.get("src/main/resources/south.txt");
        try (BufferedReader br = Files.newBufferedReader(south,StandardCharsets.UTF_8)){
            String line;
            while ((line=br.readLine()) !=null){
                for (String word: line.split("")){
                    if (word.length()>5)
                        count = count + 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;


        }










}