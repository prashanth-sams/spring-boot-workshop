package practice.autowiring.lesson2;

import org.springframework.stereotype.Component;

@Component("one")
public class NameGeneratorImpl implements NameService {

    @Override
    public String runMethod() {
        return "Prashanth";
    }
}
