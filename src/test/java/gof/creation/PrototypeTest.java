package gof.creation;

import gof.creation.config.PrototypeConfig;
import gof.creation.prototype.ConcretePrototype1;
import gof.creation.prototype.ConcretePrototype2;
import gof.creation.prototype.Prototype;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PrototypeTest {

    @Test
    void prototype_test() throws Exception {
        //given
        Prototype prototype1 = new ConcretePrototype1("Prototype1", LocalDate.now());
        Prototype prototype2 = new ConcretePrototype2("Prototype2", LocalDate.now());


        //when
        Prototype clonePrototype1 = prototype1.clone();
        Prototype clonePrototype2 = prototype2.clone();

        //then

        // 클론된 객체는 서로 다른 객체이다.
        assertThat(clonePrototype1).isNotSameAs(clonePrototype1.clone());

        // 클론된 객체의 attributes 는 서로 같다.
        assertThat(clonePrototype1.getName()).isEqualTo(prototype1.getName());
        assertThat(clonePrototype1.getCreatedDate()).isEqualTo(prototype1.getCreatedDate());
        assertThat(clonePrototype2.getName()).isEqualTo(prototype2.getName());
        assertThat(clonePrototype2.getCreatedDate()).isEqualTo(prototype2.getCreatedDate());

        // 클론 객체의 부모로 prototype 을 가지고, 구현체에 따라 분류된다.
        assertThat(clonePrototype1).isInstanceOf(Prototype.class);
        assertThat(clonePrototype1).isInstanceOf(ConcretePrototype1.class);
        assertThat(clonePrototype1).isNotInstanceOf(ConcretePrototype2.class);


        assertThat(clonePrototype2).isInstanceOf(Prototype.class);
        assertThat(clonePrototype2).isInstanceOf(ConcretePrototype2.class);
        assertThat(clonePrototype2).isNotInstanceOf(ConcretePrototype1.class);



    }
}
