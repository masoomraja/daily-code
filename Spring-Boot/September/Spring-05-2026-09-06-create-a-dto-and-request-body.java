// Practice date: 2026-09-06
// Topic: Spring MVC / DTO
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.web.bind.annotation.*;

record CreateUserRequest(String name, String email) {}
record UserResponse(long id, String name, String email) {}

@RestController
@RequestMapping("/api/users")
class UserDtoController {
    @PostMapping
    UserResponse create(@RequestBody CreateUserRequest request) {
        return new UserResponse(1L, request.name(), request.email());
    }
}
