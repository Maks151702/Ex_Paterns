package GeneratingPatterns.FactoryMethod;

public class Programm {

    public  static  void  main(String[] args){
        TransportFactory transportFactory = createTransportBySpeciality("car");
        Transport transport = transportFactory.createTransport();
        transport.deliver();
    }


    static TransportFactory createTransportBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("car")){
            return new CarFactory();
        } else if (speciality.equalsIgnoreCase("bicycle")) {
            return  new BicycleFactory();
        } else if (speciality.equalsIgnoreCase("airplane")) {
            return new AirplaneFactory();
        } else {
            throw new RuntimeException(speciality + "is unknown speciality");
        }
    }
}
