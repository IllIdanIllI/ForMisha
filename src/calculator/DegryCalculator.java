package calculator;

public class DegryCalculator extends CommonCalkulator {
    public int degry(int a1,int b1 ){
        double res=Math.pow(a1, b1);
        return (int)res;
    }

}