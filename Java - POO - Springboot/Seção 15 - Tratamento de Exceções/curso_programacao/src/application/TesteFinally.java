package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteFinally {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lekiz\\OneDrive\\Documentos\\Estudos\\Udemy\\01. Java - POO - Nelio Alves\\Seção 15 - Tratamento de Exceções\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally Bloco executado");
        }
    }
}