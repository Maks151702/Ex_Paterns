package GeneratingPatterns.Singleton;

public class ProgrammLogger {
    private static ProgrammLogger programmLogger;
    private static  String logFile = "This my log file. \n\n";

    public static synchronized ProgrammLogger getProgrammLogger(){
        if(programmLogger==null){
            programmLogger = new ProgrammLogger();
        }
        return programmLogger;
    }
    private ProgrammLogger(){

    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }

    public void showLogInfo(){
        System.out.println(logFile);
    }


}
