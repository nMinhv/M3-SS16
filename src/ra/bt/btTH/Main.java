package ra.bt.btTH;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File output2 = new File("output2");

        File helloFile = new File("output2/hello.txt");

        File subFolder = new File("output2/subfolder");

        File outputSub = new File("output2/subfolder/outputSub");

        File outputSubTxt = new File("output2/subfolder/outputSub.txt");

        if (output2.mkdir()) {
            helloFile.createNewFile();
            if (subFolder.mkdir()) {
                outputSub.mkdir();
                outputSubTxt.createNewFile();
            }
        }
        subFolder.renameTo(new File("output2/subfolder1"));
        System.out.println("Cấu trúc của cây thư mục:");
        displayDirTree(output2);
    }

    private static void displayDirTree(File rootDir) {
        if (rootDir.isDirectory()) {
            System.out.println(rootDir.getName());
            File[] subFilesLv1 = rootDir.listFiles();
            String prefixLv1 = "-";
            for (File sub : subFilesLv1
            ) {
                System.out.println(prefixLv1 + sub.getName());
                if (sub.isDirectory()) {
                    String prefixLv2 = "--";
                    File[] subFilesLv2 = sub.listFiles();
                    for (File subLv2 : subFilesLv2
                    ) {
                        System.out.println(prefixLv2 + subLv2.getName());
                    }
                }
            }
        } else {
            System.out.println("đây ko phải là thư mục");
        }
    }
}
