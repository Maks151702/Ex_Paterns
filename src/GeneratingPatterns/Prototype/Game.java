package GeneratingPatterns.Prototype;

public class Game implements Copyable{
    private String name;
    private String version;

    public Game(String name, String version){
        this.name = name;
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public Object copy() {
        Game copy = new Game(name,version);
        return  copy;
    }

    public String toString(){
        return "Game{"+
                "name=" + name +
                ", version=" + version + '\'' +
                '}';
    }
}
