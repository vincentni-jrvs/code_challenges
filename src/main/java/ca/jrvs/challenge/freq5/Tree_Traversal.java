package ca.jrvs.challenge.freq5;

public class Tree_Traversal {
    void Post(Node node) {
        if (node == null) return;
        Post(node.left);
        Post(node.right);
        System.out.print(node.key + " ");
    }

    void In(Node node) {
        if (node == null) return;
        In(node.left);
        System.out.print(node.key + " ");
        In(node.right);
    }

    void Pre(Node node) {
        if (node == null) return;
        System.out.print(node.key + " ");
        Pre(node.left);
        Pre(node.right);
    }

    /**
     * Tree traversal (pre-order, in-order, post-order)
     */
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
}
