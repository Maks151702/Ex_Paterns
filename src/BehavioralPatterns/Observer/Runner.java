package BehavioralPatterns.Observer;

public class Runner {
    public static void main(String[]args){
        DeveloperJobSite jobSite = new DeveloperJobSite();

        jobSite.addVacancy("Junior Java Position");
        jobSite.addVacancy("Senior Java Position");


        Observer firstSubscriber = new Subscriber("Mark Twein");
        Observer secondSubscriber = new Subscriber("Leonardo Di");

        jobSite.addObserve(firstSubscriber);
        jobSite.addObserve(secondSubscriber);

        jobSite.addVacancy("Junior Python Position");

        jobSite.removeVacancy("Junior Java Position");
    }
}
