package jUnitTests;

import org.junit.Assert;
import org.junit.Test;


public class DivisionJUnit extends jUnitBaseCalculatorClass {

    @Test
    public void resultDivJULong() {
        long resultDivJULong = calculator.div(222, 2);
        Assert.assertEquals(resultDivJULong, 111);
    }

    //  @Test
    public void resultDivJULong2() {
        long resultDivJULong = calculator.div(222, 0);
        Assert.assertEquals(resultDivJULong, 0);
    }

    @Test
    public void resultDivJUDouble() {
        double resultDivJUDouble = calculator.div(5.5, 2.0);
        Assert.assertEquals(resultDivJUDouble, 2.75, 0.0);
    }

    @Test
    public void resultDivJUDouble2() {
        double resultDivJUDouble = calculator.div(0.0, 2.0);
        Assert.assertEquals(resultDivJUDouble, 0.0, 0.0);
    }


}

