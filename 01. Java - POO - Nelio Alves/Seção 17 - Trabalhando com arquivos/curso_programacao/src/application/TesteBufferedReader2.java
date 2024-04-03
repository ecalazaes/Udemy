package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteBufferedReader2 {
    public static void main(String[] args) {

        String path = "C:\\Users\\lekiz\\OneDrive\\Documentos\\Estudos\\Udemy\\01. Java - POO - Nelio Alves\\Seçao 17 - Trabalhando com arquivos\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
