package Exception02;

public class MyException extends RuntimeException {

    public MyException (String msg){
        super(msg); // 부모님의 생성자를 호출
    }

    public MyException (Exception ex){
        super(ex); //부모님의 생성자를 호출한다.
    }
}
