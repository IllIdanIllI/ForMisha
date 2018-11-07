package actions;

import calculator.DegryCalculator;
import calculator.SQRTCalculator;
import constant.Regular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Home
 */
public class Choise {
    private int a;
    private int b;
    private  static List<Operation> list = new ArrayList();
    private Operation operation;

    public void chos(int choise) throws IOException {
        SQRTCalculator CC = new SQRTCalculator();
        DegryCalculator CC1 = new DegryCalculator();
        operation = new Operation();
        Choise ch = new Choise();

        if (choise !=7 && choise!=8) {
            enter();
        }
        switch (choise) {
            case 1:
                System.out.println("Ваш результат " + CC.addition(a, b));
                String oper = "Сумма = ";
                operation.setOperation("Сумма = ");
                ch.operVariable(Integer.toString(a),Integer.toString(b),Double.toString(CC.addition(a,b)),oper);

                break;
            case 2:
                System.out.println("Ваш результат " + CC.subtraction(a, b));
                break;
            case 4:
                System.out.println("Ваш результат " + CC.devide(a, b));
                break;
            case 3:
                System.out.println("Ваш результат " + CC.multiplication(a, b));
                break;

            case 5:
                System.out.println("Ваш результат " + CC.squereroot(a, b));
                break;
            case 6:
                System.out.println("Ваш результат " + CC1.degry(a, b));
                break;
            case 7:

                for(Operation op: list){
                System.out.println(op);
            }
                System.out.println(list.isEmpty());
                break;
            case 8:
                break;
            default:
                System.out.println("Проверьте номер, который вы набрали");
                break;
        }
    }

    private void enter() throws IOException {
        Regular regular=new Regular();
        String num="",num1="",answer="Цифру или число, а не буквы";
        System.out.println("Введите 2 часа");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Первое");
        num = br.readLine();
        while(regular.сheck(num)){
            System.out.println(answer);
            num = br.readLine();
        }
        System.out.println("Второе");
        num1 = br.readLine();
        while(regular.сheck(num1)){
            System.out.println(answer);
            num1 = br.readLine();
        }
        a = Integer.parseInt(num);
        b = Integer.parseInt(num1);

    }

private void operVariable(String num, String num1, String res, String oper){
    operation = new Operation();
    operation.setFirst(num);
    operation.setSecond(num1);
    operation.setResult(res);
    operation.setOperation(oper);
//    operation.sum();

    list.add(operation);
    for (Operation operation: list) {
        System.out.println(operation);
    }

}
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

}
