package GeneratingPatterns.FactoryMethod;

public class AirplaneFactory implements TransportFactory{
    @Override
    public Transport createTransport() {
        return new Airplane();
    }
}
