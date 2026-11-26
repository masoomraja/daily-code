// Practice date: 2026-11-02
// Topic: Spring MVC / CRUD
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService service;
    public ProductController(ProductService service) { this.service = service; }

    @GetMapping
    List<Product> all() { return service.findAll(); }

    @PostMapping
    ResponseEntity<Product> create(@RequestParam String name) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(name));
    }
}
