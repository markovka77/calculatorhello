package pro.sky.java.course2.skyprospring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Service
abstract
class ServiceCalculator implements ServiceIterface {

    public String plus(int num1, int num2) {
        int total = num1 + num2;
        return Integer.toString(total);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam int num1, int num2) {
        int total = num1 - num2;
        return Integer.toString(total);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam int num1, int num2) {
        int sum = num1 * num2;
        return Integer.toString(sum);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam int num1, int num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        } else {
            int sum = num1 / num2;
            return Integer.toString(sum);
        }
    }

}
