package day18;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public Node addNode(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = addNode(value, node.left);

        } else {
            node.right = addNode(value, node.right);
        }

        return node;
    }

    public static void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(node.value + " ");
            dfs(node.right);
        }
    }
}
