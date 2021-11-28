package gof.creation;


import gof.creation.builder.v3.ProductV3;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderV3Test {


    @Test
    void builderTest() throws Exception {
        //when
        ProductV3 productV3A = ProductV3
                .builder
                .name("ProductA")
                .createdDate(LocalDate.now())
                .build();

        //then
        assertThat(productV3A).isInstanceOf(ProductV3.class);
        assertThat(productV3A.getName()).isEqualTo("ProductA");
        assertThat(productV3A.getCreatedDate()).isEqualTo(LocalDate.now());

    }

}
