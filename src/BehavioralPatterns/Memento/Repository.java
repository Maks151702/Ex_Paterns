package BehavioralPatterns.Memento;

public class Repository {
    private Memento memento;

    public Memento getMemento(){
        return  memento;
    }

    public void setMemento(Memento memento){
        this.memento=memento;
    }
}
