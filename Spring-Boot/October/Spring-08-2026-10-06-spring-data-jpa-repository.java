// Practice date: 2026-10-06
// Topic: Spring Data JPA
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingIgnoreCase(String keyword);
}
