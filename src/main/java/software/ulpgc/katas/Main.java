package software.ulpgc.katas;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    static void main() throws IOException {
        File file = new File("document.txt");
        try (InputStream InputStream = new FileInputStream(file)) {
            byte[] bytes = InputStream.readAllBytes();
            System.out.println(new String(bytes));
        } catch (Exception e){
            System.out.println("Ha fallado");
        }
    }
}