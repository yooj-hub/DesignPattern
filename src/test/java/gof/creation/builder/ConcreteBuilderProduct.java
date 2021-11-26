package gof.creation.builder;

import java.time.LocalDate;

public class ConcreteBuilderProduct implements BuilderProduct {
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

    public Product getProduct(){
        return new Product(name, createdDate);
    }
}
