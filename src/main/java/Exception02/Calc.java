package Exception02;

public class Calc {
    /**
     * i를 k로 나눈 결과를 리턴한다.
     * 0으로 나눌 경우, ArithmeticException이 발생한다.
     * @param i
     * @param k
     * @return
     * @throws MyException
     */
    public int divide(int i, int k) throws MyException{
        int value = 0;
        try{
            value = i/k;
        }catch(ArithmeticException ae){
            throw new MyException(ae);
        }
        return value;
    }
}
