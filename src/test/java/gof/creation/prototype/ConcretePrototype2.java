package gof.creation.prototype;

import java.time.LocalDate;

public class ConcretePrototype2 implements Prototype {

    private String name;
    private LocalDate createdDate;

    public ConcretePrototype2(String name, LocalDate createdDate) {
        this.createdDate = createdDate;
        this.name = name;
    }



    private ConcretePrototype2(Prototype prototype) {
        this.name = prototype.getName();
        this.createdDate = prototype.getCreatedDate();
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype2(this);
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
