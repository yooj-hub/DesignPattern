package gof.creation.prototype;

import java.time.LocalDate;

public interface Prototype {
    Prototype clone();
    String getName();
    LocalDate getCreatedDate();
}
