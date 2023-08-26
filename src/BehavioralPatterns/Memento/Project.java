package BehavioralPatterns.Memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version=version;
        this.date=new Date();
    }

    public  Memento memento(){
        return new Memento(version);
    }

    public void load(Memento memento){
        version=memento.getVersion();
        date=memento.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
