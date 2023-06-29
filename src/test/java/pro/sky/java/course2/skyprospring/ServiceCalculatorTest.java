package pro.sky.java.course2.skyprospring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceCalculatorTest {

    Integer num1, num2;

    @BeforeEach
    void setUp() {
        num1 = 6;
        num2 = 3;
    }

    @Test
    void testHello() {
        String hello = "Добро пожаловать в калькулятор!";
        assertNotNull(hello);

    }

    @Test
    void plus() throws Exceptions {
        String total = String.valueOf(num1 + num2);
        String expResult = num1 + " + " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.plus(num1, num2));
    }

    @Test
    void minus() throws Exceptions {
        String total = String.valueOf(num1 - num2);
        String expResult = num1 + " - " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.minus(num1, num2));
    }

    @Test
    void multiply() throws Exceptions {
        String total = String.valueOf(num1 * num2);
        String expResult = num1 + " * " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.multiply(num1, num2));
    }

    @Test
    void divide() throws Exceptions {
        Double total = Double.valueOf(String.valueOf(num1 / num2));
        String expResult = num1 + " / " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.divide(num1, num2));
    }

    @Test
    void checkInputOfVariables() {
        assertNotNull(num1);
        assertNotNull(num2);


    }
    @Test
    void checkNullParams(){
        num2=0;
        assertThrows(Exception.class,()->{
            divide();
        });
    }
}