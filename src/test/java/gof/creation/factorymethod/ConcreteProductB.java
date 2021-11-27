package gof.creation.factorymethod;

import java.time.LocalDate;

public class ConcreteProductB implements Product {

    private final String name;
    private final LocalDate createdDate;

    ConcreteProductB(String name) {
        this.name = name;
        this.createdDate = LocalDate.now();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getCreatedDate() {
        return this.createdDate;
    }
}
