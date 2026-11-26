// Practice date: 2026-09-02
// Topic: Spring Core / DI
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
class GreetingService {
    String message() { return "Dependency injection is working"; }
}

@RestController
class GreetingApi {
    private final GreetingService service;

    GreetingApi(GreetingService service) {
        this.service = service;
    }

    @GetMapping("/api/message")
    String message() { return service.message(); }
}
