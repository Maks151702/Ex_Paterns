package BehavioralPatterns.Iterator;

public class Runner {
    public static void main(String[]args){
        String[] skills = {"Java", "Spring", "Hibernate"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Max Chubar",skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString()+ " " );
        }
    }
}
