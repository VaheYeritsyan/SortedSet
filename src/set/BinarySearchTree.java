package set;

import java.util.NoSuchElementException;

/**
 * @param <T> Accepts any object that implements comparable
 *            adds the values sorted by their natural ordering
 * @author Vahe Yeritsyan
 */
public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;
    private int size = 0;

    /**
     * @param value
     * @return true if value was added, false otherwise
     */
    public boolean add(T value) {
        if (value == null) {
            return false;
        }
        if (contains(value)) {
            return false;
        }
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
        size++;
        return true;
    }

    /**
     * traverses in-order and prints all the values
     */
    public void traverse() {
        if (root != null) {
            root.traverse();
            System.out.println();
        }
    }

    /**
     * @return the minimum element of the list
     * @throws NoSuchElementException if the set is empty
     */
    public T getMin() {
        if (root == null) {
            new NoSuchElementException("the set is empty");
        }
        return (T) root.getMin();
    }

    /**
     * @param value to be deleted
     * @return true if the element was deleted, false if not found
     */
    public boolean remove(T value) {
        if (!contains(value)) {
            return false;
        }
        int sizeBefore = size;
        root = remove(root, value);
        return sizeBefore != size;
    }

    /**
     * helper function for removing
     */
    public Node remove(Node subtree, T value) {
        if (value.compareTo((T) subtree.getData()) < 0) {
            subtree.setLeft(remove(subtree.getLeft(), value));
        } else if (value.compareTo((T) subtree.getData()) > 0) {
            subtree.setRight(remove(subtree.getRight(), value));
        } else {
            size--;
            if (subtree.getLeft() == null) {
                return subtree.getRight();
            } else if (subtree.getRight() == null) {
                return subtree.getLeft();
            } else {
                subtree.setData(subtree.getRight().getMin());
                subtree.setRight(remove(subtree.getRight(), (T) subtree.getData()));
            }
        }
        return subtree;
    }

    /**
     * @param value to be checked if exists
     * @return true if value is in the set, false otherwise
     */

    public boolean contains(T value) {
        if (root == null) {
            return false;
        }
        return root.contains(value);
    }

    /**
     * @return the amount of elements in the set
     */
    public int getSize() {
        return size;
    }
}