package calculator;

/**
 *
 * @author Home
 */
public class SQRTCalculator extends CommonCalkulator {
    public double squereroot(int a1, int b1){
        double b2=1.0/b1;
        double res=Math.pow(a1, b2);
        return res;
    }

}
