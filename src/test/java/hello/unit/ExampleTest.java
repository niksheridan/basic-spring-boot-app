package hello.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ExampleTest {

    @Test
    public void shouldDoSomething() {
        assertThat(true).isEqualTo(true);
    }
}
