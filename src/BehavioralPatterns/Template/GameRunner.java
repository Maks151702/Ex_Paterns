package BehavioralPatterns.Template;

public class GameRunner {
    public static void main(String[]args){
        PlayerTemplate firstPlayer = new FirstPlayer();
        PlayerTemplate substitutionPlayer = new SubstitutionPlayer();

        firstPlayer.playOn();

        System.out.println("\n=================\n");

        substitutionPlayer.playOn();
    }
}
