package StructuralPatterns.Adapter;

public class AdapterJavaToCar extends JavaAplication implements Transport{
    @Override
    public void lock() {
        OpenCar();
    }

    @Override
    public void unlock() {
        CloseCar();
    }

    @Override
    public void go() {
        RunningCar();
    }
}
