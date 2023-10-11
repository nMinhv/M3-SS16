package ra.bt.bt1_2;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        String str = "Bài tập: đếm số lượng từ trong file\n" +
                "\n" +
                "Mục tiêu: luyện tâp đọc file.\n" +
                "\n" +
                "Đề bài: Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó.\n" +
                "\n" +
                "Hướng dẫn:\n" +
                "\n" +
                "B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)\n" +
                "\n" +
                "B2: Tạo hàm đọc file trên và trả ra String.\n" +
                "\n" +
                "B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử\n" +
                "\n" +
                "B4: length của mảng trên chính là số lượng từ trong file.\n";
        File textFile = new File("src/ra/bt/bt1_2/text.txt");
        FileWriter fileWriter = new FileWriter(textFile);
        fileWriter.write(str);
        fileWriter.close();
        FileReader fileReader = new FileReader(textFile);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = reader.readLine();
        int countWord = 0;
        int countLine = 0;
        while (line != null) {
            String[] arr = line.split(" ");
            countWord += arr.length;
            countLine += 1;
            line = reader.readLine();
        }
        System.out.println("Số tử " + countWord);
        System.out.println("Số dòng " + countLine);
        reader.close();

    }
}
