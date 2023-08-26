package BehavioralPatterns.ChainOfResponsibility;

public class BugTracker {
    public static void main(String[]args){
        Notifier report = new Report(Priority.ROUTINE);
        Notifier impotantReport = new ImpotantReport(Priority.IMPOTANT);
        Notifier asapReport = new ASAPReport(Priority.ASAP);

        report.setNextNotifier(impotantReport);
        impotantReport.setNextNotifier(asapReport);

        report.notifierManager("All good.",Priority.ROUTINE);
        report.notifierManager("We have wrong.", Priority.IMPOTANT);
        report.notifierManager("We have fatal error!!", Priority.ASAP);
    }
}
