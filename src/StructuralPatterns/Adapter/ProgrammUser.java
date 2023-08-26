package StructuralPatterns.Adapter;

public class ProgrammUser {
    public static void main(String[]args){
        Transport transport= new AdapterJavaToCar();

        transport.lock();
        transport.unlock();
        transport.go();
    }
}
