package Exception;

/**
 * Calc
 * 계산을 위한 클래스
 */

public class Calc2 {
    /**
     * i 를 k로 나눈 결과를 리턴한다.
     * 0으로 나눌 경우, ArithmeticException이 발생한다.
     * @param i
     * @param k
     * @return
     * @ throws ArithmeticException
     */

    public int divide(int i, int k )throws ArithmeticException{
        int value = 0;
        value = i/ k;
        return value;
    }
}
