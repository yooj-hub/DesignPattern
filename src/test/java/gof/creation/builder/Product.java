package gof.creation.builder;

import java.time.LocalDate;

public class Product {
    private final String name;
    private final LocalDate createdDate;

    public Product(String name, LocalDate createdDate) {
        this.name = name;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }
}
