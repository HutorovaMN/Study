package maryna;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[] qwer = new int[]{1, 2, 3, 4, 5};
        String str = "asd123ajbc123";
        String strPalid = "madam2";


        System.out.println(calc.plus(x, y));
        System.out.println(calc.minus(x, y));
        System.out.println(Arrays.toString(calc.perevertish(qwer)));
        System.out.println(calc.stringSum(str));
        System.out.println(calc.polidrom(strPalid));
    }

}
