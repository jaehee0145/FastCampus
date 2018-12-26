package Exception02;

import java.net.URL;

public class UrlExam {
    public static void main (String args []){
        try{
            URL url = new URL("http://jahee0145.github.io");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}

//checked Exception 은 반드시 Exception 처리를 해줘야 한다.
// 무슨 내용이었을까..
