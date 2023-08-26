package GeneratingPatterns.FactoryMethod;

public class BicycleFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
