package main;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    void testCalcY() {
        double t = 2.2;
        double[] expected = new double[3];
        expected[0] = -0.1946097; expected[1] = 0.4599946; expected[2] = 1.4028611;
        double result = main.calcY(0.2, t);
        assertEquals(expected[0], result, 0.001, "y incorrect!");
        result = main.calcY(0.9, t);
        assertEquals(expected[1], result, 0.001, "y incorrect!");
        result = main.calcY(2, t);
        assertEquals(expected[2], result, 0.001, "y incorrect!");
    }

    @Test
    void testGetSumAndArif() {
        double[] expected = new double[2];
        expected[0] = 0; expected[1] = 0;
        int a = main.calcN(0.004);
        double[] buff = main.createArr(a);
        double[] result = main.getSumAndArif(buff);
        assertEquals(expected[0], result[0], 0, "sum of elements not same!");
        assertEquals(expected[1], result[1], 0, "middle arithmetical is incorrect!");
    }

    @Test
    void testCalcN() {
        int expected = 450;
        int result = main.calcN(0.004);
        assertEquals(expected,result,0,"amount of elements not same!");
    }
}