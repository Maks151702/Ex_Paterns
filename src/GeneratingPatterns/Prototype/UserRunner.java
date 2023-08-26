package GeneratingPatterns.Prototype;

public class UserRunner {
    public static void main(String[]args){
        Game master = new Game("Floop", "0.5.6");

        System.out.println(master);

        GameFactory factory = new GameFactory(master);
        Game masterClone = factory.cloneGame();
        System.out.println("\n==============\n");
        System.out.println(masterClone);
    }
}
