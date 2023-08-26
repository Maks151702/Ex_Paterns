package GeneratingPatterns.Singleton;

public class User {
    public static void main(String[]args){
        ProgrammLogger.getProgrammLogger().addLogInfo("First log...");
        ProgrammLogger.getProgrammLogger().addLogInfo("Second log...");
        ProgrammLogger.getProgrammLogger().addLogInfo("Last log...");

        ProgrammLogger.getProgrammLogger().showLogInfo();
    }
}
