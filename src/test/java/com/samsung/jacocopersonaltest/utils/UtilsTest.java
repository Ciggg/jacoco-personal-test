package com.samsung.jacocopersonaltest.utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UtilsTest {

    @Test
    public void testAdd() {
        final Utils utils = new Utils();
        int actual = utils.add(2, 3);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testSubtract() {
        final Utils utils = new Utils();
        int actual = utils.subtract(8, 3);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void testSquare() {
        final Utils utils = new Utils();
        int actual = utils.square(3);
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void testModulo() {
        final Utils utils = new Utils();
        int actual = utils.modulo(6,3);
        Assertions.assertEquals(0, actual);
    }
    @Test
    public void testMultiply() {
        final Utils utils = new Utils();
        int actual = utils.multiply(6,3);
        Assertions.assertEquals(18, actual);
    }
//    @Test
//    public void testCube() {
//        final Utils utils = new Utils();
//        int actual = utils.cube(2);
//        Assertions.assertEquals(8, actual);
//    }
}