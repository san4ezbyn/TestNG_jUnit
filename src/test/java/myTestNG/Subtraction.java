package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Subtraction extends myBaseCalculatorClass {


    @Test
    public void resultSubLong(){
        long resultSubLong = calculator.sub(125, 25);
        Assert.assertEquals(resultSubLong, 100);
    }

    @Test
    public void resultSubDouble(){
        double resultSubDouble=calculator.sub(12.5, 2.5);
        Assert.assertEquals(resultSubDouble, 10.0);
    }
}


