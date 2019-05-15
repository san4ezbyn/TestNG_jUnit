package myTestNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class myBaseCalculatorClass {

    Calculator calculator = new Calculator();

    private long lNum1;
    private double dNum1;
    private long lNum2;
    private double dNum2;

    @BeforeClass
    public void beforeClass(){
        System.out.println("It goes before Class\n");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("It goes before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("It goes after Method\n");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("It goes after Class");
    }


}
