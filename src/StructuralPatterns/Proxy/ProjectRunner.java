package StructuralPatterns.Proxy;

public class ProjectRunner {
    public static void main(String[]args){
        Project project = new ProxyProject("https://github.darkworld/RealWorld");

        project.run();
    }
}
