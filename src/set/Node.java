package set;

/**
 * @param <T> Accepts any object that implements comparable
 * @author Vahe Yeritsyan
 */
public class Node<T extends Comparable<T>> {
    private T data;
    private Node left;
    private Node right;

    public Node(T value) {
        this.data = value;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    /**
     * recursively insert the value in it's place, order by object's natural order
     *
     * @param value
     */
    public void insert(T value) {
        if (value.compareTo(data) < 0) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    /**
     * traverses the set in-order and prints the values
     */

    public void traverse() {
        if (left != null) {
            left.traverse();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.traverse();
        }
    }

    /**
     * @return the minimum element of the list
     */
    public T getMin() {
        if (left != null) {
            return (T) left.getMin();
        }
        return data;
    }

    /**
     * @param value to be checked if exists
     * @return true if value is in the set, false otherwise
     */
    public boolean contains(T value) {
        if (value.compareTo(data) == 0) {
            return true;
        }

        if (value.compareTo(data) < 0) {
            if (left == null) {
                return false;
            }
            return left.contains(value);
        }
        if (value.compareTo(data) > 0) {
            if (right == null) {
                return false;
            }
            return right.contains(value);
        }
        return false;
    }
}