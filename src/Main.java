import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        File hello = new File("hello.txt");
        FileWriter fileWriter = new FileWriter(hello);
    }
}