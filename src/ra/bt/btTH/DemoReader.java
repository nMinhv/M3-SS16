package ra.bt.btTH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("output2/hello.txt");
        // reader
        int c = fileReader.read();
        while (c != -1){
            System.out.print((char) c );
            c = fileReader.read();
        }
        // Buffer
//        BufferedReader reader = new BufferedReader(fileReader);
//        String read = reader.readLine();
//        while (read !=null){
//            System.out.println(read);
//            read = reader.readLine();
//        }
        fileReader.close();
    }
}
