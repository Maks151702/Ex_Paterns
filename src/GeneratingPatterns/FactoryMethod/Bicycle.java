package GeneratingPatterns.FactoryMethod;

public class Bicycle implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка на велосипеде");
    }
}
