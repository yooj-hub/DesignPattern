package gof.creation.builder.v1;

import java.time.LocalDate;

public class ConcreteBuilderProductV1 implements BuilderProductV1 {
    private String name;
    private LocalDate createdDate;

    @Override
    public void name(String name) {
        this.name = name;

    }

    @Override
    public void createdDate(LocalDate localDate) {
        this.createdDate = localDate;

    }

    public ProductV1 getProduct(){
        return new ProductV1(name, createdDate);
    }
}
