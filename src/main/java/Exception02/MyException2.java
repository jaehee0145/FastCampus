package Exception02;

public class MyException2 extends RuntimeException {

    public MyException2 (String msg){
        super(msg);
    }

    public MyException2 (Exception ex){
        super(ex);
    }
}
