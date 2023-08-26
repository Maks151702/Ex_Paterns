package BehavioralPatterns.Memento;

public class Runner {
    public static void main(String[]args) throws InterruptedException {
        Project project = new Project();
        Repository repository = new Repository();

        System.out.println("Create project. Version 0.1");
        project.setVersionAndDate("Version 0.1");

        System.out.println(project);

        System.out.println("Save version on repository");
        repository.setMemento(project.memento());
        Thread.sleep(5000);
        System.out.println("Update version 0.1.1");
        project.setVersionAndDate("Version 0.1.1");
        System.out.println(project);
        System.out.println("Get bad feedback");
        Thread.sleep(1000);
        System.out.println("Roll back to Version 0.1");

        project.load(repository.getMemento());

        System.out.println("Project after roll back: ");
        System.out.println(project);
    }
}
