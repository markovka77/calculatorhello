package pro.sky.java.course2.skyprospring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorHello {
    @GetMapping(path = "/calculator")
    public String hello() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam int num1, int num2) {
        int total = num1 + num2;
        String sum = Integer.toString(num1)+" + "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return sum;
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, int num2) {
        int total = num1 - num2;
        String sum = Integer.toString(num1)+" - "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return sum;
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, int num2) {
        int total = num1 * num2;
        String sum = Integer.toString(num1)+" * "+ Integer.toString(num2)+ " = "+Integer.toString(total);
        return sum;
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return "На ноль делить нельзя!";
        } else {
            int total = num1 / num2;
            String sum = Integer.toString(num1)+" + "+ Integer.toString(num2)+ " = "+Integer.toString(total);
            return sum;
        }
    }

}
