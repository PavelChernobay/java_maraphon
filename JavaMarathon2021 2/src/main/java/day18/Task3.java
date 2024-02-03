package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        root.addNode(14, root);
        root.addNode(23, root);
        root.addNode(11, root);
        root.addNode(16, root);
        root.addNode(22, root);
        root.addNode(27, root);
        root.addNode(5, root);
        root.addNode(15, root);
        root.addNode(18, root);
        root.addNode(8, root);
        root.addNode(24, root);
        root.addNode(150, root);

        Node.dfs(root);
    }
}