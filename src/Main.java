import actions.Choise;
import actions.Menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();
        Main.someMethod();
    }

    private static void someMethod() {
        Choise ch = new Choise();
        int num1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.print("Делайте выбор: - ");
                String num = br.readLine();
                num1 = Integer.parseInt(num);
                ch.chos(num1);
            } while (num1 != 8);
        } catch (IOException e) {
            System.out.println("Что-то пошло не так " + e.getMessage());
        }
    }
}
