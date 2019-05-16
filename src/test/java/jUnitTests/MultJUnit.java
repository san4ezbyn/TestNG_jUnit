package jUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class MultJUnit extends jUnitBaseCalculatorClass {

    @Test
    public void resultMultLong() {
        long resultMultJULong = calculator.mult(25, 25);
        Assert.assertEquals(625, resultMultJULong);
        System.out.println("Multiplication-jUnit 1/2");
    }

    @Test
    public void resultMultJUDouble() {
        double resultMultJUDouble = calculator.mult(1.25, 2.05);
        Assert.assertEquals(2.5625, resultMultJUDouble, 0.0);
        System.out.println("Multiplication-jUnit 2/2");
    }
}
