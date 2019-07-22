package ca.jrvs.challenge.freq5;

public class B_Tree {
    public boolean search(int target, Node head) {
        if (head == null) return false;
        else if (target == head.data) return true;
        return target > head.data ? search(target, head.right) : search(target, head.left);
    }

    /**
     * Implement a binary search tree
     *
     * @return
     */
    private static class Node {
        private int data;
        private Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }
}
