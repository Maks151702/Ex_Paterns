package BehavioralPatterns.ChainOfResponsibility;

public class ASAPReport extends Notifier{
    public ASAPReport(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier use ASAP Report. Need help!!!"+" "+message);
    }
}
