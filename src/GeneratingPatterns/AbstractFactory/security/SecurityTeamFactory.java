package GeneratingPatterns.AbstractFactory.security;

import GeneratingPatterns.AbstractFactory.Developer;
import GeneratingPatterns.AbstractFactory.ProjectManager;
import GeneratingPatterns.AbstractFactory.ProjectTeamFactory;
import GeneratingPatterns.AbstractFactory.Tester;

public class SecurityTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new CppDeveloper();
    }

    @Override
    public Tester getTester() {
        return new SecurityTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new SecurityManager();
    }
}
