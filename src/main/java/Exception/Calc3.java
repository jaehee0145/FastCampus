package Exception;

public class Calc3 {
//직접 Exception 처리하는 방법
// return 값이 초기값으로 출력되므로 문제가 될 수 있다!!

    public int divide(int i, int k) {
        int value=0;
        try {
            value = i / k;

        } catch (ArithmeticException ae) {
            System.out.println("0으로 나눌 수 없어!!");
        }

        return value;
    }
}
