package Exception02;

public class Calc2 {
public int divide(int i, int k) throws MyException2{
    int value = 0;
    try {
        value = i/k;
    } catch(ArithmeticException ae){
        throw new MyException2 (ae);
    }
    return value;

}
}
