package GeneratingPatterns.AbstractFactory.banking;

import GeneratingPatterns.AbstractFactory.Developer;
import GeneratingPatterns.AbstractFactory.ProjectManager;
import GeneratingPatterns.AbstractFactory.ProjectTeamFactory;
import GeneratingPatterns.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
