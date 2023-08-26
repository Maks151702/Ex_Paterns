package StructuralPatterns.Bridge;

public class ProgrammCreator {
    public static void main(String[]args){
        Programm[] programms = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Programm programm: programms){
            programm.developProgramm();
        }
    }
}
