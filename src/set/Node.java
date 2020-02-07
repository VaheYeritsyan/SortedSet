package set;

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

    public void traverse() {
        if (left != null) {
            left.traverse();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.traverse();
        }
    }

    public T getMin() {
        if (left != null) {
            return (T) left.getMin();
        }
        return data;
    }

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