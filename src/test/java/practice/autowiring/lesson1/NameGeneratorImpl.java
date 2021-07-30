package practice.autowiring.lesson1;

import org.springframework.stereotype.Component;

@Component
public class NameGeneratorImpl implements NameService {

    @Override
    public String runMethod() {
        return "Prashanth";
    }
}
