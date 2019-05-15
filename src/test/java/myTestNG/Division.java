package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class Division extends myBaseCalculatorClass {


    @Test
    public void resultDivLong() {
        long resultDivLong = calculator.div(9, 3);
        Assert.assertEquals(resultDivLong, 3);
        checkTime();
    }

    // @Test
    public void resultDivLong2() {
        long resultDivLong = calculator.div(9, 0);
        Assert.assertEquals(resultDivLong, 0);
    }

    @Test
    public void resultDivLong3() {
        long resultDivLong = calculator.div(0, 4);
        Assert.assertEquals(resultDivLong, 0);
        checkTime();
    }

    @Test
    public void resultDivDouble() {
        double resultDivDouble = calculator.div(6.5, 2.0);
        Assert.assertEquals(resultDivDouble, 3.25);
        checkTime();
    }

    // @Test
    public void resultDivDouble2() {
        double resultDivDouble = calculator.div(6.5, 0.0);
        Assert.assertEquals(resultDivDouble, 0.0);
    }

    @Test
    public void resultDivDouble3() {
        double resultDivDouble = calculator.div(0, 2.0);
        Assert.assertEquals(resultDivDouble, 0.0);
        checkTime();
    }

    //time check helps to see that all methods go at one and the same time (secs and millisecs)
    private void checkTime() {
        System.out.println("Current Time: " + new Date(System.currentTimeMillis()));
    }
}



