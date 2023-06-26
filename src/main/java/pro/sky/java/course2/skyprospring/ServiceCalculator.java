package pro.sky.java.course2.skyprospring;

import org.springframework.stereotype.Service;



@Service
abstract class ServiceCalculator {

    public static String hello() {
        return "Добро пожаловать в калькулятор!";
    }


    public static String plus(Integer num1, Integer num2) throws Exceptions {
        checkInputOfVariables(num1,num2);
        int total = num1 + num2;
        String sum = Integer.toString(num1)+" + "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return sum;
    }




    public static String minus(Integer num1, Integer num2) throws Exceptions {
        checkInputOfVariables(num1,num2);
        int total = num1 - num2;
        String sum = Integer.toString(num1)+" - "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return sum;
    }


    public static String multiply(Integer num1, Integer num2) throws Exceptions {
        checkInputOfVariables(num1,num2);
        int total = num1 * num2;
        String sum = Integer.toString(num1)+" * "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return sum;
    }


    public static String divide(Integer num1, Integer num2) throws Exceptions {
        checkInputOfVariables(num1, num2);
        if (num1 == 0 || num2 == 0) {
            throw  new IllegalArgumentException("На ноль делить нельзя");
        } else {
            double num1d=num1;
            double total = num1d / num2;
            String sum = Integer.toString(num1)+" / "+ Integer.toString(num2)+ " = "+ String. valueOf (total);
            return sum;
        }
    }

    static void checkInputOfVariables(Integer num1, Integer num2) throws Exceptions {
        if (num1==null||num2 ==null){
            throw new Exceptions("Введены не все переменные");
        }
    }
}
