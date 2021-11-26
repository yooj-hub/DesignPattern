package gof.creation.builder;

import java.time.LocalDate;

public interface BuilderProduct {
    void name(String name);
    void createdDate(LocalDate localDate);

}
