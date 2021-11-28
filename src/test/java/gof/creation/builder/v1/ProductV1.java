package gof.creation.builder.v1;

import java.time.LocalDate;

public class ProductV1 {
    private final String name;
    private final LocalDate createdDate;

    public ProductV1(String name, LocalDate createdDate) {
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
