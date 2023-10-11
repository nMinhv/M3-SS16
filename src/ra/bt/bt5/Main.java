package ra.bt.bt5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File textFile = new File("src/ra/bt/bt1_2/text.txt");
        FileReader fileReader = new FileReader(textFile);
        BufferedReader reader = new BufferedReader(fileReader);
        String str = reader.readLine();
        List<String> list = new ArrayList<>();
        int length = 0;
        while (str != null) {
            String[] arrStr = str.split(" ");
            for (String s : arrStr) {
                list.add(s);
                if (length < s.length()) {
                    length = s.length();
                }
            }
            str = reader.readLine();
        }
        System.out.println("các từ có độ dài " + length);
        for (String s : list) {
            if (s.length() == length) {
                System.out.println(s);
            }
        }
    }
}
