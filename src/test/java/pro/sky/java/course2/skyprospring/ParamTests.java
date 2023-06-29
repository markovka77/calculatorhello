package pro.sky.java.course2.skyprospring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.springframework.lang.NonNull;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParamTests {
    @ParameterizedTest
    @CsvSource({"'6','3'","'8','4'","'2','2'"})
    void plus(Integer num1, Integer num2) throws Exceptions {
        String total = String.valueOf(num1 + num2);
        String expResult = num1 + " + " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.plus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"'6','3'","'8','4'","'2','2'"})
    void minus(Integer num1, Integer num2) throws Exceptions {
        String total = String.valueOf(num1 - num2);
        String expResult = num1 + " - " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.minus(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({"'6','3'","'8','4'","'2','2'"})
    void multiply(Integer num1, Integer num2) throws Exceptions {
        String total = String.valueOf(num1 * num2);
        String expResult = num1 + " * " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.multiply(num1, num2));
    }
    @ParameterizedTest
    @CsvSource({"'6','3'","'8','4'","'2','2'"})
    void divide(Integer num1, Integer num2) throws Exceptions {
        Double total = Double.valueOf(String.valueOf(num1 / num2));
        String expResult = num1 + " / " + num2 + " = " + total;
        assertEquals(expResult, ServiceCalculator.divide(num1, num2));
    }


    //дальше страннно будет

    @ParameterizedTest
    @NullSource
    void checkInputOfVariables(Integer num1, Integer num2) {
        assertNotNull(num1);
        assertNotNull(num2);
    }

}
