package GeneratingPatterns.AbstractFactory;

import GeneratingPatterns.AbstractFactory.banking.BankingTeamFactory;

public class MegaBank {
    public static void main(String[] args){
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writecode();
        tester.testCode();
        projectManager.manageProject();
    }
}
