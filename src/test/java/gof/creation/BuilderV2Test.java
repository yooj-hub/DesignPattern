package gof.creation;


import gof.creation.builder.v2.ConcreteBuilderProductV2;
import gof.creation.builder.v2.Directorv2;
import gof.creation.builder.v2.ProductV2;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderV2Test {


    @Test
    void builderTest() throws Exception {
        //given
        ConcreteBuilderProductV2 concreteBuilderProduct = new ConcreteBuilderProductV2();

        Directorv2 directorv2 = new Directorv2(concreteBuilderProduct);


        //when
        ProductV2 productV2A = directorv2.construct()
                .name("ProductA")
                .createdDate(LocalDate.now())
                .build();


        //then
        assertThat(productV2A).isInstanceOf(ProductV2.class);
        assertThat(productV2A.getName()).isEqualTo("ProductA");
        assertThat(productV2A.getCreatedDate()).isEqualTo(LocalDate.now());
    }

}
