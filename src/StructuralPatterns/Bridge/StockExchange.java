package StructuralPatterns.Bridge;

public class StockExchange extends Programm{

    protected StockExchange(Developer developer){
        super(developer);
    }
    @Override
    public void developProgramm() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
