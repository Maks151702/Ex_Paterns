package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Fruit> fruits = new ArrayList<Fruit>();

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }

    public void removeFruit(Fruit fruit){
        fruits.remove(fruit);
    }

    public void createPurchase(){
        System.out.println("Create purchase in shop...");
        for(Fruit fruit: fruits){
            fruit.addInCart();
        }
    }
}
