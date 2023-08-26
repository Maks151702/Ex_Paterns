package StructuralPatterns.Bridge;

public class BankSystem extends Programm{

    protected BankSystem(Developer developer){
        super(developer);
    }
    @Override
    public void developProgramm() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}
