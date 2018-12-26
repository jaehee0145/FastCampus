package Exception;

public class CalcExam {

    public static void main (String [] args){
        Calc calc = new Calc();
        int value = calc.divide(4,0);

        System.out.println(value);
    }
}
