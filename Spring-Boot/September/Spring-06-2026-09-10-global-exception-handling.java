// Practice date: 2026-09-10
// Topic: Spring MVC / Exceptions
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    ResponseEntity<String> handleBadRequest(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}

@RestController
class ExampleErrorController {
    @GetMapping("/api/error-demo")
    String demo() { throw new IllegalArgumentException("Example validation error"); }
}
