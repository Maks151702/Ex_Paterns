package GeneratingPatterns.Prototype;

public class GameFactory {
    Game game;

    public GameFactory(Game game){
        this.game=game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    Game cloneGame(){
        return (Game) game.copy();
    }
}
