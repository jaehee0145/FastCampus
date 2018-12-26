package Exception;

public class Calc4 {
    // 메서드에서 throws 처리
    // 사용하는 쪽에서 try - catch 해야함
    public int divide(int i, int k) throws ArithmeticException {
        return i / k;

    }
}
