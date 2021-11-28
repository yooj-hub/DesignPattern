package gof.creation.prototype;

import java.time.LocalDate;

public class ConcretePrototype1 implements Prototype {

    private final String name;
    private final LocalDate createdDate;

    public ConcretePrototype1(String name, LocalDate createdDate) {
        this.createdDate = createdDate;
        this.name = name;
    }


    private ConcretePrototype1(Prototype prototype) {
        this.name = prototype.getName();
        this.createdDate = prototype.getCreatedDate();
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype1(this);
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
