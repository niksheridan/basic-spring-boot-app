package hello.docker_image_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ExampleDockerImageTest {

    TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void shouldDoSomething() {
        ResponseEntity<String> helloWorld = restTemplate.getForEntity("http://localhost:8080/", String.class);
        assertThat(helloWorld.getBody()).isEqualTo("Hello World!");
    }
}
