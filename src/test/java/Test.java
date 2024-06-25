import maryna.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

public class Test {

    private Calculator calc = new Calculator();

    @org.junit.jupiter.api.Test
    public void TestSum() {
        int result = calc.plus(2, 5);
        Assertions.assertEquals(result, 7);
    }

    @org.junit.jupiter.api.Test
    public void TestMinus() {
        int result = calc.minus(7, 5);
        Assertions.assertEquals(result, 2);
    }

    @org.junit.jupiter.api.Test()
    public void TestPerevertish() {
        int[] result = new int[]{1, 2, 3, 4, 5};
        int[] result1 = calc.perevertish(result);
        int[] result2 = new int[]{5, 4, 3, 2, 1};

        Assertions.assertArrayEquals(result1, result2);
    }

    @org.junit.jupiter.api.Test
    public void TestStringSum() {
        int result = calc.stringSum("qwer1iuy1iiu2uh");
        Assertions.assertEquals(result, 4);
    }

    @org.junit.jupiter.api.Test
    public void TestPolidromPositiv() {
        Assertions.assertTrue(calc.polidrom("topot"));
    }

    @org.junit.jupiter.api.Test
    public void TestPolidromNegativ() {
        Assertions.assertFalse(calc.polidrom("topotyt"));
    }
}
