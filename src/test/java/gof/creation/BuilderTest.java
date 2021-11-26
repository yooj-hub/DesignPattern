package gof.creation;

import gof.creation.builder.ConcreteBuilderProduct;
import gof.creation.builder.Director;
import gof.creation.builder.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTest {



    @Test
    void builderTest() throws Exception {
        //given
        ConcreteBuilderProduct concreteBuilderProduct = new ConcreteBuilderProduct();

        Director director = new Director(concreteBuilderProduct);



        //when
        director.construct().name("ProductA");
        director.construct().createdDate(LocalDate.now());
        Product productA = concreteBuilderProduct.getProduct();

        //then
        assertThat(productA).isInstanceOf(Product.class);
        assertThat(productA.getName()).isEqualTo("ProductA");
        assertThat(productA.getCreatedDate()).isEqualTo(LocalDate.now());
    }

}
