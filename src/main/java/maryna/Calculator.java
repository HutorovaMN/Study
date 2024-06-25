package maryna;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public int plus(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public int minus(int x, int y) {
        int min = x - y;
        return min;
    }

    public int[] perevertish(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
        return array;
    }

    public int stringSum(String str) {
        String st = str.replaceAll("[A-Za-z]", "");
        int sum = 0;
        for (Character c : st.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }

    public boolean polidrom(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length / 2; i++) {
            if (ch[i] != ch[ch.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
