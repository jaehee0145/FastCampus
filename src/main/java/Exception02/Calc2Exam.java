package Exception02;

public class Calc2Exam {

    public static void main (String args []){
        Calc2 cal = new Calc2();
        try {
            int value = cal.divide(5,0);
            System.out.println(value);
        }catch(MyException2 me){
            System.out.println("내가 만든 Exception !! :-) ");
        }
    }
}
