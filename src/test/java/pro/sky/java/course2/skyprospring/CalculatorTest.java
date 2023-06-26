package pro.sky.java.course2.skyprospring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {
    Integer num1;
    Integer num2;
    @BeforeEach
    public void setUp() {
        num1 = 6;
        num2 = 2;
    }

    @Test
    public void hello(){
        String hello = "Добро пожаловать в калькулятор";
        Assert.assertNotEquals(hello,null);
    }

    @Test
    public void plus(){
        setUp();
        int result = num1 + num2;
        Assert.assertEquals(8,result);
    }
    @Test
    public void minus(){
        setUp();
        int result = num1 - num2;
        Assert.assertEquals(4,result);
    }
    @Test
    public void multiply(){
        setUp();
        int result = num1 * num2;
        Assert.assertEquals(12,result);
    }
    @Test
    public void divide(){
        setUp();
        int result = num1 / num2;
        Assert.assertEquals(3,result);
    }
    @Test
    public void divideWithNull(){
       Assert.assertThrows(Exceptions.class,()-> ServiceCalculator.divide(num1,num2));
    }
}
