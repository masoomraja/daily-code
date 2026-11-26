// Practice date: 2026-10-10
// Topic: Spring Service / Transactions
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Product create(String name) {
        return repository.save(new Product(name));
    }
}
