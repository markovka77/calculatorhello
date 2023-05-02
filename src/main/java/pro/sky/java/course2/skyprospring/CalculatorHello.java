package pro.sky.java.course2.skyprospring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path ="/calculator")
public class CalculatorHello {
    @GetMapping(path = "/calculator")
    public String hello() {
        return ServiceCalculator.hello();
    }



    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, int num2) {
        return ServiceCalculator.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, int num2) {
        return ServiceCalculator.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, int num2) {
        return ServiceCalculator.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, int num2) {
        return ServiceCalculator.divide(num1, num2);
    }
}
