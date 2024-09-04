package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteBufferedWritter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Bom dia", "Boa tarde", "Boa noite"};

        String path = "C:\\Users\\lekiz\\OneDrive\\Documentos\\Estudos\\Udemy\\01. Java - POO - Nelio Alves\\Seção 17 - Trabalhando com arquivos\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
