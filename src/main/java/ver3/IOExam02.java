package ver3;

import java.io.File;

public class IOExam02 {

    public static void main(String[] args) {
        File file = new File("c:/tmp");
        if(file.exists()){
            if(file.isDirectory()){
                printFolder("", file);
            }else{
                printFile("", file);
            }
        }

    }

    public static void printFile(String space, File file){
        System.out.println(space + file.getName());
    }

    public static void printFolder(String space, File file){
        System.out.println(space + file.getName()+ "[DIR]");
        File files [] = file.listFiles();
        space += "   ";
        for(File file1: files){
            if(file1.isDirectory()){
                printFolder(space, file1);
            }else{
                printFile(space, file1);
            }
        }

    }
}
