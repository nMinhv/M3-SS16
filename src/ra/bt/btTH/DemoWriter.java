package ra.bt.btTH;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("output2/hello.txt");
        fileWriter.write("Hello java IO\n");
        fileWriter.write("Hello 2\n");
        String[] strings = {"name1", "name2", "name3"};
        for (String string : strings
        ) {
            fileWriter.write(string + "\n");
        }
        fileWriter.close();
        // buffer
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
    }
}
