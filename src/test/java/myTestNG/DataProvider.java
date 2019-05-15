package myTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider extends myBaseCalculatorClass {

    @Test(dataProvider = "dataProviderSum")
    public  void sumDP(long x, long y, long expected){
        long resultSumDP= calculator.sum(x, y);
        Assert.assertEquals(resultSumDP, expected);
    }

    @Test(dataProvider = "dataProviderSubtraction")
    public void subDP(long x, long y, long result){
        long resultSubDP= calculator.sub(x,y);
        Assert.assertEquals(resultSubDP, result);
    }

    @org.testng.annotations.DataProvider(name = "dataProviderSubtraction")
    public Object[][] valuesForSub() {
        return new Object[][] {
                {20, 15, 5},
                {9, 6, 3},
                {1,-10, 11},
                {0, 0, 0}
        };
    }
    @org.testng.annotations.DataProvider(name = "dataProviderSum")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {2, 2, 4},
                {3, 2, 5},
                {25, 25, 50},
                {999, 1, 1000},
                {0, 555, 555}

        };
    }
}
