package ua.edu.kibit.credit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class creditController {

    @GetMapping("/greet")
        public String sayGreet() {
            return "Greetings, Anna!";
    }
}
