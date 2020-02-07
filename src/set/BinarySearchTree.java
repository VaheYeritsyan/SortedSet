package set;


public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;
    private int size = 0;

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

    public void traverse() {
        if (root != null) {
            root.traverse();
            System.out.println();
        }
    }

    public T getMin() {
        if (root == null) {
            new RuntimeException("the set is empty");
        }
        return (T) root.getMin();
    }

    public boolean remove(T value) {
        if (!contains(value)) {
            return false;
        }
        int sizeBefore = size;
        root = remove(root, value);
        return sizeBefore != size;
    }

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

    public boolean contains(T value) {
        if (root == null) {
            return false;
        }
        return root.contains(value);
    }

    public int getSize() {
        return size;
    }
}


