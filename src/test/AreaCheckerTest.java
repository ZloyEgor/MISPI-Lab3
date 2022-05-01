import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AreaCheckerTest {

    @Test
    public void testFirstQuadrant() {
        double[] xValues = {1, 2, 3, 4, 5};
        double[] yValues = {0.1, 0.7, 2, 2.005, 3};
        double[] rValues = {1, 1.5, 2, 2.5, 3};

        boolean[] expected = {false, false, false, false, false};
        boolean[] result = new boolean[5];

        for (int i = 0; i < xValues.length; i++) {
            result[i] = AreaChecker.checkArea(xValues[i], yValues[i], rValues[i]);
        }
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSecondQuadrant() {
        double[] xValues = {-3, -1, -2, -1, -1};
        double[] yValues = {0.1, 0.7, 2, 1.2, 1.1};
        double[] rValues = {1, 2.5, 2, 2.5, 3};

        boolean[] expected = {false, true, false, false, true};
        boolean[] result = new boolean[5];

        for (int i = 0; i < xValues.length; i++) {
            result[i] = AreaChecker.checkArea(xValues[i], yValues[i], rValues[i]);
        }
        assertArrayEquals(expected, result);
    }

    @Test
    public void testThirdQuadrant() {
        double[] xValues = {-3, -1, -2, -1, -1};
        double[] yValues = {-4, -0.7, -2, -0.2, -0.6};
        double[] rValues = {1, 2.5, 2, 2.5, 3};

        boolean[] expected = {false, false, false, true, true};
        boolean[] result = new boolean[5];

        for (int i = 0; i < xValues.length; i++) {
            result[i] = AreaChecker.checkArea(xValues[i], yValues[i], rValues[i]);
        }
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFourthQuadrant() {
        double[] xValues = {1, 1, 2, 4, 5};
        double[] yValues = {-4, -0.7, -2, -0.2, -0.6};
        double[] rValues = {2, 2.5, 3, 2.5, 3};

        boolean[] expected = {false, true, false, false, false};
        boolean[] result = new boolean[5];

        for (int i = 0; i < xValues.length; i++) {
            result[i] = AreaChecker.checkArea(xValues[i], yValues[i], rValues[i]);
        }
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAxis() {
        double[] xValues = {0, 0, -1, 2, 3};
        double[] yValues = {-1.5, 0.7, 0, 0, 0};
        double[] rValues = {2, 2.5, 3, 2.5, 3};

        boolean[] expected = {true, true, true, false, false};
        boolean[] result = new boolean[5];

        for (int i = 0; i < xValues.length; i++) {
            result[i] = AreaChecker.checkArea(xValues[i], yValues[i], rValues[i]);
        }
        assertArrayEquals(expected, result);
    }
}

