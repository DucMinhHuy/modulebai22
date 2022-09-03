package thuchanh3;

import java.io.File;
import java.util.Scanner;

public class FileCalculateAdapter implements FileCalculator{

    @Override
    public long calculateSize(String path) {
//        FileUtil fieldUtil=new FileUtil();
//        File file=new File(path);
//        return fieldUtil.calculateSize(file);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter file or folder path :");
        String path=sc.nextLine();
        FileCalculator fileCalculator=new FileCalculateAdapter();
        Client client=new Client(fileCalculator);
        client.printFileSize(path);
    }
}
