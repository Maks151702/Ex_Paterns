package BehavioralPatterns.ChainOfResponsibility;

public class ImpotantReport extends Notifier{
    public ImpotantReport(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier use Impotant Report!"+" "+message);
    }
}
