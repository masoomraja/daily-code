// Practice date: 2026-08-10
// Topic: Spring MVC
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @GetMapping("/users/{id}")
    public String byId(@PathVariable long id) {
        return "User ID: " + id;
    }

    @GetMapping("/greet")
    public String greet(@RequestParam(defaultValue="Developer") String name) {
        return "Hello, " + name;
    }
}
