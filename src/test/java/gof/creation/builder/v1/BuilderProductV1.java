package gof.creation.builder.v1;

import java.time.LocalDate;

public interface BuilderProductV1 {
    void name(String name);
    void createdDate(LocalDate localDate);

}
