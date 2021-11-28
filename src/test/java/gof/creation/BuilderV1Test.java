package gof.creation;

import gof.creation.builder.v1.ConcreteBuilderProductV1;
import gof.creation.builder.v1.DirectorV1;
import gof.creation.builder.v1.ProductV1;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderV1Test {



    @Test
    void builderTest() throws Exception {
        //given
        ConcreteBuilderProductV1 concreteBuilderProduct = new ConcreteBuilderProductV1();

        DirectorV1 directorV1 = new DirectorV1(concreteBuilderProduct);



        //when
        directorV1.construct().name("ProductA");
        directorV1.construct().createdDate(LocalDate.now());
        ProductV1 productV1A = concreteBuilderProduct.getProduct();

        //then
        assertThat(productV1A).isInstanceOf(ProductV1.class);
        assertThat(productV1A.getName()).isEqualTo("ProductA");
        assertThat(productV1A.getCreatedDate()).isEqualTo(LocalDate.now());
    }

}
