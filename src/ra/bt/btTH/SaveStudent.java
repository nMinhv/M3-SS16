package ra.bt.btTH;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveStudent {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(20,"hoang"));
        students.add(new Student(30,"nam"));
        File studentFile = new File("list-student.txt");
        if(studentFile.createNewFile()){
            System.out.println("Đã tạo file");
            FileWriter fileWriter = new FileWriter(studentFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student: students) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        }
    }
}
