package GeneratingPatterns.FactoryMethod;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка на машине");
    }
}
