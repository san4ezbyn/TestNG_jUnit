package jUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class SumJUnit extends jUnitBaseCalculatorClass {

    @Test
    public void resultOfSumLong(){
        long resSumLong=calculator.sum(2,3);
        Assert.assertEquals(5, resSumLong);
    }
    @Test
    public void resultOfSumDouble(){
        double resSumDouble=calculator.sum(2.1,3.2);
        Assert.assertEquals(5.3, resSumDouble, 0.01);
    }
    @Test
    public void resultOfSumLong2(){
        long resSumLong2=calculator.sum((Long.parseLong("2")), Long.parseLong("3"));
        Assert.assertEquals(5, resSumLong2);
    }
    @Test
    public void resultOfSumDouble2(){
        double resSumDouble2=calculator.sum((Double.parseDouble("2.2")), Double.parseDouble("3.1"));
        Assert.assertEquals(5.3, resSumDouble2, 0.01);
    }
}

