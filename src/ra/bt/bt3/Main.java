package ra.bt.bt3;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {

        File textFile = new File("src/ra/bt/bt1_2/text.txt");
        FileReader fileReader = new FileReader(textFile);
        BufferedReader reader = new BufferedReader(fileReader);
        Map<String, Integer> list = new HashMap<>();
        String line = reader.readLine();
        while (line != null) {
            String[] arrLine = line.split(" ");
            for (String s : arrLine) {
                if (!list.containsKey(s.toLowerCase()) && !s.isEmpty()) {
                    list.put(s.toLowerCase(), 1);
                } else if (!s.isEmpty()){
                    list.put(s, list.get(s.toLowerCase()) + 1);
                }
            }
            line = reader.readLine();
        }
        for (String i: list.keySet()
             ) {
            if(list.get(i) >1){
                System.out.println("Các từ lặp lại: " + i);
            }
        }
    }
}
