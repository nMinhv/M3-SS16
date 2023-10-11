package ra.bt.bt4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        File textFile = new File("src/ra/bt/bt1_2/text.txt");
        FileReader fileReader = new FileReader(textFile);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        List<String> list = new ArrayList<>();
        while (line != null) {
            Collections.addAll(list, line.split(" "));
            line = reader.readLine();
        }
        System.out.println("trước khi săp xếp:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("sau khi sắp xếp");
        System.out.println(list);
    }
}
