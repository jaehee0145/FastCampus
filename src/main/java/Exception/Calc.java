package Exception;

public class Calc {
    public int divide(int i, int k){
        int value = 0;
        try {
            value = i/k;
        }catch(ArithmeticException ae){
            System.out.println("0으로 나눌 수 없다!!!!!!!!!");
        }
        return value;
    }
}
