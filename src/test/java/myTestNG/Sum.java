package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sum extends myBaseCalculatorClass {

    @Test(groups = {"symma"}, testName = "sum", priority = 2)
    public void resultSumLong() {
        long resultSumLong = calculator.sum(20, 50);
        Assert.assertEquals(resultSumLong, 70);
        System.out.println("Sum 1");
    }

    @Test(testName = "sum", priority = 1, alwaysRun = true, groups = {"symma"})
    public void resultSumDouble() {
        double resultSumDouble = calculator.sum(2.5, 5.0);
        Assert.assertEquals(7.5, resultSumDouble, 0.0);
        System.out.println("Sum 2");
    }

    @Test(dependsOnGroups = {"symma"})//TODO dependsOnGroups  НЕ работает
    public void resultOfSumDouble2() {
        double resSumDouble2 = calculator.sum((Double.parseDouble("2.2")), Double.parseDouble("3.1"));
        Assert.assertEquals(resSumDouble2, 5.3, 0.01);
        System.out.println("Sum 3");
    }

}
