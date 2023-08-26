package BehavioralPatterns.Template;

public abstract class PlayerTemplate {
    public void playOn(){
        System.out.println("Player in Game");
        showSkill();
        System.out.println("The player has left the field.");
    }

    public  abstract void showSkill();
}
