package gof.creation;

import gof.creation.factorymethod.*;
import org.assertj.core.api.Assertions;
import org.assertj.core.internal.bytebuddy.utility.dispatcher.JavaDispatcher;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class FactoryMethodTest {

    @Test
    void factory_method_test() throws Exception {
        //given
        Creator creator = new ConcreteCreator();

        //when
        Product productA = creator.factoryMethod("A", "ProductA");
        Product productB = creator.factoryMethod("B", "ProductB");

        //then

        // product A test
        assertThat(productA).isInstanceOf(ConcreteProductA.class);
        assertThat(productA.getName()).isEqualTo("ProductA");
        assertThat(productA.getCreatedDate()).isEqualTo(LocalDate.now());


        // product b test
        assertThat(productB).isInstanceOf(ConcreteProductB.class);
        assertThat(productB.getName()).isEqualTo("ProductB");
        assertThat(productB.getCreatedDate()).isEqualTo(LocalDate.now());

        // exception test
        assertThatThrownBy(() -> creator.factoryMethod("C", "ProductC"))
                .isInstanceOf(IllegalArgumentException.class);

    }

}
