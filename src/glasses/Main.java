package glasses;

import set.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Glasses> glasses = new BinarySearchTree<>();
        glasses.add(new Glasses("Yellow", 16));
        glasses.add(new Glasses("Pink", 14.5));
        glasses.add(new Glasses("White", 19.5));
        glasses.add(new Glasses("Purple", 20));
        glasses.traverse();
    }
}
