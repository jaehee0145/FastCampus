package my.examples.ioexam;

import java.io.File;

public class IOExam01 {
    public static void main(String[] args) {
        //폴더를 만들고 그 안에 몇가지 폴더를 만든다.
        // 그 안에 몇가지 txt 파일을 복사한다.
        //1. 위의 폴더가 있는지 없는지 검사한다. 있으면 있다고 출력
        //2. 해당 경로가 파일인지, 폴더인지를 검사한다. 파일인지, 폴더인지 출력
        //3. 해당 경로에 어떤 파일과 폴더들이 있는지 정보를 출력한다.
        //4. IOExam02를 만든다. PATH를 지정하면 폴더일 경우, 해당 폴더아래의 모든 파일과 폴더정보를 출력한다.
        //(재귀호출) 사용

        File file = new File("c:/tmp");
        if (file.exists()) {
            System.out.println("해당 경로에 존재합니다.");
            if (file.isDirectory()) {
                System.out.println("폴더");
                File[] list = file.listFiles();
                for (File f : list) {
                    System.out.println(f.getName() + " " + (f.isDirectory() ? "[DIR]" : "[FILE]")+ f.length());
                }
            } else if(file.isFile()){
                System.out.println("파일");
            }else{
                System.out.println("what??");
            }
        }else{
            System.out.println("존재하지 않습니다.");
        }

    }
}
