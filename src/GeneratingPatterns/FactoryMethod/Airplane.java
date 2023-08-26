package GeneratingPatterns.FactoryMethod;

public class Airplane implements Transport{
    @Override
    public void deliver() {
        System.out.println("Доставка на самолете");
    }
}
