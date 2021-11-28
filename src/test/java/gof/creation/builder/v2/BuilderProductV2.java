package gof.creation.builder.v2;

import java.time.LocalDate;

public interface BuilderProductV2 {
    BuilderProductV2 name(String name);
    BuilderProductV2 createdDate(LocalDate localDate);
    ProductV2 build();
}
