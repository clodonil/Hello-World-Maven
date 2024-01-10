import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldAPI {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldAPI.class, args);
    }

    @RestController
    public static class HelloWorldController {

        @GetMapping("/")
        public String helloWorld() {
            String version = "1.0";
            String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return "Hello World! API Version: " + version + ", Current Date: " + currentDate;
        }
    }
}
