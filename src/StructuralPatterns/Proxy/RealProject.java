package StructuralPatterns.Proxy;

public class RealProject implements Project{
    public String ulr;

    public RealProject(String ulr) {
        this.ulr = ulr;
        load();
    }

    public void load(){
        System.out.println("Loading project from" + ulr + "...");
    }

    @Override
    public void run() {
        System.out.println("Running project " +ulr + "...");

    }
}
