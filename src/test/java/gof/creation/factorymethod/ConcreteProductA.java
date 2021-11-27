package gof.creation.factorymethod;

import java.time.LocalDate;

public class ConcreteProductA implements Product {

    private final String name;
    private final LocalDate createdDate;

    ConcreteProductA(String name) {
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
