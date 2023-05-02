package pro.sky.java.course2.skyprospring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;



@Service
abstract class ServiceCalculator  {
    public static String hello() {
        return "Добро пожаловать в калькулятор!";
    }


    public static String plus( int num1, int num2) {
        int total = num1 + num2;
        String sum = Integer.toString(num1)+" + "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return (sum);
    }


    public static String minus( int num1, int num2) {
        int total = num1 - num2;
        String sum = Integer.toString(num1)+" - "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return (sum);
    }


    public static String multiply( int num1, int num2) {
        int total = num1 * num2;
        String sum = Integer.toString(num1)+" * "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return (sum);
    }


    public static String divide( int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        } else {
            double num1d=num1;
            double total = num1d / num2;
            return  Integer.toString(num1)+" / "+ Integer.toString(num2)+ " = "+ String. valueOf (total);
        }
    }

}
