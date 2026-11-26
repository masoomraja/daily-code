// Practice date: 2026-10-02
// Topic: Spring Data JPA
// Example: Spring Boot / Spring Framework snippet.
// Add the corresponding Spring Boot starters and package declarations in a real project.

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    protected Product() {}
    public Product(String name) { this.name = name; }
    public Long getId() { return id; }
    public String getName() { return name; }
}
