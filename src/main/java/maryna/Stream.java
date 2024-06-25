package maryna;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Stream {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        double d = 333.444;
        int s = 123;
        Random ran = new Random();
        for (int i = 0; i < 7; i++) {
            list.add(ran.nextInt(5));
        }
        System.out.println(list);
        list.stream().distinct().forEach(System.out::print);
        System.out.println("____________________________________________________________________________________");
        list.stream().reduce((x, y) -> x + y).stream().forEach(System.out::print);
        System.out.println("____________________________________________________________________________________");
        sorter(list);
        System.out.println("____________________________________________________________________________________");
        kolchetStream(list);
        System.out.println("____________________________________________________________________________________");
        /*. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
3. */

        changeDouble(d);
        System.out.println("____________________________________________________________________________________");
        /*Найти сумму цифр числа*/
        sumCifr(s);
        /*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов*/
        System.out.println("____________________________________________________________________________________");
        kratn(list);
        System.out.println("____________________________________________________________________________________");
        kratnStream(list);
    }

    private static void kratnStream(List<Integer> list) {
        int k = 3;
        Optional t = list.stream().filter(x -> x % k == 0).reduce((x, y) -> x + y);
        System.out.println("Summ kratno 3 = " + t);
    }

    private static void kratn(List<Integer> list) {
        Integer[] array = list.toArray(new Integer[0]);
        int k = 3;
        int sum = 0;
        int trigger = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0 && array[i] != 0) {
                sum += array[i];
                trigger++;
            }
        }
        System.out.println("trigger = " + trigger + " sum = " + sum);
    }

    private static void sumCifr(int s) {
        int sum = 0;
        while (s > 0) {
            sum += s % 10;
            s = s / 10;
        }
        System.out.println("sum ==" + sum);
    }

    private static void changeDouble(double d) {
        double x = d * 1000 % 1000;
        double q = (int) d;
        double w = q / 1000;
        System.out.println("x = " + x);
        System.out.println("w = " + w);
        double result = x + w;
        System.out.println("result = " + result);
    }


    private static void kolchetStream(List<Integer> list) {
        System.out.println(list.stream().filter(x -> x % 2 == 0 && x != 0).count());
    }

    private static void kolchet(List<Integer> list) {
        Integer[] array = list.toArray(new Integer[0]);
        int trig = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != 0) && (array[i] % 2) == 0) {
                trig++;
            }
        }
        System.out.println("Количество четных чисел = " + trig);
    }

    private static void sorter(List<Integer> list) {
        list.stream().sorted().forEach(System.out::print);
    }
}
