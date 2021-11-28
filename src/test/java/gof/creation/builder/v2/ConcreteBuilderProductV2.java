package gof.creation.builder.v2;

import java.time.LocalDate;

public class ConcreteBuilderProductV2 implements BuilderProductV2 {
    private String name;
    private LocalDate createdDate;

    @Override
    public BuilderProductV2 name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BuilderProductV2 createdDate(LocalDate localDate) {
        this.createdDate = localDate;
        return this;

    }

    @Override
    public ProductV2 build() {
        return new ProductV2(name, createdDate);
    }
}
