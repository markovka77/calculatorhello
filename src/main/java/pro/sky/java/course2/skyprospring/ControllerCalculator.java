package pro.sky.java.course2.skyprospring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculator")
public class ControllerCalculator {
    @GetMapping()
    public String hello() {
        return ServiceCalculator.hello();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam Integer num1, Integer num2) throws Exceptions {
               return ServiceCalculator.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam Integer num1, Integer num2) throws Exceptions {
       return ServiceCalculator.minus(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2) throws Exceptions {
        return ServiceCalculator.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam Integer num1, Integer num2)throws Exceptions {
        return ServiceCalculator.divide(num1, num2);
        }
    }


