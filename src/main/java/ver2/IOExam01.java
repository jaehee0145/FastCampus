package ver2;

import java.io.File;

public class IOExam01 {
    public static void main(String[] args) {


        File file = new File("c:/fastcampus");
        if (file.exists()) {
            System.out.println("있어요");
            if (file.isDirectory()) {
                System.out.println("DIR");
                File[] files = file.listFiles();
                for (File f : files) {
                    System.out.println(f.getName() + " " + (f.isDirectory() ? "[DIR]" : "[FILE]") + f.length());
                }
            }else if(file.isFile()){
                System.out.println("File");
            }else{
                System.out.println(" '-' ");
            }
        }else{
            System.out.println("없어요");
        }
    }
}
