package StructuralPatterns.Bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ codes...");
    }
}
