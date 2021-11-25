package gof.creation;


import gof.creation.abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryTest {
    AbstractFactory factory1 = new ConcreteFactory1();
    AbstractFactory factory2 = new ConcreteFactory2();
    @Test
    void abstractFactoryTest1() throws Exception {
        //given


        //when
        AbstractProductA productA = factory1.createProductA();
        AbstractProductB productB = factory1.createProductB();

        //then
        assertThat(productA.getFrom()).isEqualTo("ProductA1");
        assertThat(productB.getFrom()).isEqualTo("ProductB1");
        assertThat(productA.getName()).isEqualTo("ProductA1 1");
        assertThat(productB.getName()).isEqualTo("ProductB1 2");


    }

    @Test
    void abstractFactoryTest2() throws Exception {
        //given


        //when
        AbstractProductA productA = factory2.createProductA();
        AbstractProductB productB = factory2.createProductB();

        //then
        assertThat(productA.getFrom()).isEqualTo("ProductA2");
        assertThat(productB.getFrom()).isEqualTo("ProductB2");
        assertThat(productA.getName()).isEqualTo("ProductA2 1");
        assertThat(productB.getName()).isEqualTo("ProductB2 2");

    }

}
