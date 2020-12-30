package day6;

import java.io.*;

public class DiffBtwWhileFor {
    public static void main(String[] args) throws IOException {
        String path=System.getProperty("user dir")+ File.separator+"TestFiles"+File.separator+"Student.txt";
        System.out.println(path);
        FileInputStream fis =new FileInputStream(path);
        FileReader fileReader =new FileReader(path);
        BufferedReader BF=new BufferedReader(fileReader);
        String val =BF.readLine();
        System.out.println(val);
        System.out.println(BF.readLine());
        System.out.println(BF.readLine());
    }
}
