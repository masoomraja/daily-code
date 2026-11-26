// Practice date: 2026-11-06
// Topic: Validation
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.web.bind.annotation.*;

record RegisterRequest(
    @NotBlank String name,
    @Email @NotBlank String email,
    @Size(min=8) String password
) {}

@RestController
@RequestMapping("/api/register")
class RegistrationController {
    @PostMapping
    String register(@Valid @RequestBody RegisterRequest request) {
        return "Registration request accepted for " + request.email();
    }
}
