package BehavioralPatterns.ChainOfResponsibility;

public class Report extends Notifier{

    public Report(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier use simple Report:"+" "+message);
    }
}
