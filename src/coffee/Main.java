package coffee;

import set.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Coffee> coffes = new BinarySearchTree<>();
        coffes.add(new Coffee("Espresso ", 15));
        coffes.add(new Coffee("Short Macchiato", 12));
        coffes.add(new Coffee("Ristretto", 18));
        coffes.add(new Coffee("Cappuccino", 9));
        coffes.traverse();
    }

}
