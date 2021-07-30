package practice.autowiring.lesson2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest
@ContextConfiguration(classes = {NameGeneratorImpl.class})
public class AutoWiringTests {

    @Autowired
    @Qualifier("one")
    private NameGeneratorImpl nameGenerator;

    @Test
    public void testDemo() {
        System.out.println(nameGenerator.runMethod());
    }
}

