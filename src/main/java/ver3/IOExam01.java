package ver3;

import java.io.File;

public class IOExam01 {
    public static void main(String[] args) {

        File file = new File("c:/tmp");
        if (file.exists()) {
            if(file.isDirectory()){
                File[] list = file.listFiles();
                for(File f: list){
                    System.out.println((f.isDirectory()? "[DIR]":"[FILE]") +f.getName()+" "+ f.length());
                }
            }

        }
    }
}
