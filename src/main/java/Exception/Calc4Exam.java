package Exception;

public class Calc4Exam {
    public static void main(String[] args) {

        Calc4 cal = new Calc4();
        try{ int val = cal.divide(4,0);
            System.out.println(val);
    }catch(ArithmeticException ae){
            System.out.println("0으로 나눌 수 없어!!!!!!");}
    }


}
