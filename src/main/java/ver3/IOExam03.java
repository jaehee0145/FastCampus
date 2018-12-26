package ver3;

import java.util.List;

public class IOExam03 {

    public static void main (String [] args){
        Folder folder = FileManager2.scan("c:/tmp");
        System.out.println(folder);

        List<Folder> folders = folder.getFolders();
        for(Folder folder1: folders){
            System.out.println(folder1.getName());
        }


    }
}
