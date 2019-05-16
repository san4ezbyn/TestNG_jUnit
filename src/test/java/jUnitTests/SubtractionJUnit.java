package jUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class SubtractionJUnit extends jUnitBaseCalculatorClass {

    @Test
    public void resultSubJULong(){
        long resultSubJULong=calculator.sub(8,3);
        Assert.assertEquals(5, resultSubJULong);
    }
    @Test
    public void resultSubJUDouble(){
        double resultSubJUDouble=calculator.sub(11.1, 1.1);
        Assert.assertEquals(10, resultSubJUDouble, 0.0);
    }
}