package Exception;

public class Calc2Exam {

    public static void main (String args[]){
        Calc2 calc = new Calc2();
        try {
            int value = calc.divide(4,0);

            System.out.println(value);
        }catch(ArithmeticException ae){
            System.out.println("0으로 나눌 수 없어!!! ");
        }
    }
}
