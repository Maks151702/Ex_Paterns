package StructuralPatterns.Facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer write code...");
        }else{
            System.out.println("Developer looks anime...");
        }
    }
}
