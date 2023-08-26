package StructuralPatterns.Composite;

public class Shopping {
    public static void main(String[]args){
        Cart cart = new Cart();

        Fruit firstFruit = new Apple();
        Fruit secondFruit = new Apple();
        Fruit thirdFruit = new Orange();

        cart.addFruit(firstFruit);
        cart.addFruit(secondFruit);
        cart.addFruit(thirdFruit);

        cart.createPurchase();
    }
}
