package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Multiplication extends myBaseCalculatorClass {


    @Test(groups = "multiplication")
    public void resuiltMultLong() {
        long resultMultLong = calculator.mult(7, 8);
        Assert.assertEquals(resultMultLong, 56);
        System.out.println("Multiplication-tNG 1/2");
    }

    @Test(groups = "symma")
    public void resultMultDouble() {
        double resultMultDouble = calculator.mult(0.5, 0.2);
        Assert.assertEquals(resultMultDouble, 0.1);
        System.out.println("Multiplication-tNG 2/2");
    }
}




