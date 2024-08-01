package dividir.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivideController {

    @PostMapping("/divide")
    public double divide(@RequestBody DivisionRequest request) {
        double num1 = request.getNum1();
        double num2 = request.getNum2();

        if (num2 == 0) {
            throw new ArithmeticException("Error: División por cero no permitida");
        }
        return num1 / num2;
    }
}
