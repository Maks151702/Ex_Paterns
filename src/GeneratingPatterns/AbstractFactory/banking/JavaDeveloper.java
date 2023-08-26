package GeneratingPatterns.AbstractFactory.banking;

import GeneratingPatterns.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("Java developer writes Java codes...");
    }
}
