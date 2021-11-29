package gof.creation;

import gof.creation.singleton.Singleton;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class SingletonTest {

    @Test
    @DisplayName("싱글톤으로 생성한 객체는 같아야 한다.")
    void singleton_test() throws Exception {
        //given
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        //when

        //then
        Assertions.assertThat(instance1).isEqualTo(instance2);
    }

}
