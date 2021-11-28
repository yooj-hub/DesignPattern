package gof.creation.builder.v2;

import java.time.LocalDate;

public class ProductV2 {
    private final String name;
    private final LocalDate createdDate;

    public ProductV2(String name, LocalDate createdDate) {
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
