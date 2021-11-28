package gof.creation.prototype;

import gof.creation.config.PrototypeConfig;

import java.time.LocalDate;

public class Client {

    public void operation() {
        PrototypeConfig instance = PrototypeConfig.getInstance();
        Prototype prototype = instance.getConcretePrototype1();
        Prototype clone = prototype.clone();

    }


}
