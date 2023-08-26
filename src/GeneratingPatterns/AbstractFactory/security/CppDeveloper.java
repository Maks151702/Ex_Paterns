package GeneratingPatterns.AbstractFactory.security;

import GeneratingPatterns.AbstractFactory.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writecode() {
        System.out.println("C++ developer writes C++ codes...");
    }
}
