package student;

import set.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(12);
        tree.add(25);
        tree.add(7);
        tree.add(2);
        tree.add(9);
        tree.add(2);
        tree.add(18);
        tree.traverse();
        System.out.println("Min value: " + tree.getMin());
        int x = 27;
        System.out.println("The size is: " + tree.getSize());
        System.out.println("Deletion happened for " + x + ": " + tree.remove(x));
        tree.traverse();
        BinarySearchTree<Student> students = new BinarySearchTree<>();
        students.add(new Student("Vahe", "Yeritsyan", 18));
        students.add(new Student("Armen", "Vardanyan", 21));
        students.add(new Student("Tigran", "Yeritsyan", 20));
        students.add(new Student("Heghine", "Yengoyan", 20));
        students.add(new Student("Tatev", "Vardanyan", 23));
        students.traverse();
    }
}
