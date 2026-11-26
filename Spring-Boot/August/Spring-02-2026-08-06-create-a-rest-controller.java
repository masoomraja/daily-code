// Practice date: 2026-08-06
// Topic: Spring MVC / REST
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello from Spring Boot!";
    }
}
