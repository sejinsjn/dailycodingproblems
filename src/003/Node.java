package p003;

public class Node implements java.io.Serializable{

    public String value;
    public Node left;
    public Node right;

    public Node(String value) {
        this.value = value;
    }

    public Node(String value, Node left) {
        this.value = value;
        this.left = left;
    }

    public Node(String value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
