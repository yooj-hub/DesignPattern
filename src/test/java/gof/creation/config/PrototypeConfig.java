package gof.creation.config;

import gof.creation.prototype.ConcretePrototype1;
import gof.creation.prototype.Prototype;

import java.time.LocalDate;

public class PrototypeConfig {

    private static PrototypeConfig instance = new PrototypeConfig();

    private PrototypeConfig() {
    }

    public Prototype getConcretePrototype1(){
        return new ConcretePrototype1("hello", LocalDate.now());
    }


    public static PrototypeConfig getInstance() {
        return instance;
    }


}
