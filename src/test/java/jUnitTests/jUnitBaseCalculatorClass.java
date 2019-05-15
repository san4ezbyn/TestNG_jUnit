package jUnitTests;


import com.epam.tat.module4.Calculator;
import org.junit.Before;
import org.junit.BeforeClass;

public class jUnitBaseCalculatorClass {

    Calculator calculator = new Calculator();


    private long lNum1;
    private double dNum1;
    private long lNum2;
    private double dNum2;

    @BeforeClass
    public static void beforeClassJUnit(){
        System.out.println("Before Class in jUnit\n");
    }

    @Before
    public void beforeJU(){
        System.out.println("BEFORE jUnit\n");
    }


}

