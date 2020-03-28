package problem4.myqueue;

import problem2.main.TreeNode;

public class Node {
    private TreeNode node;
    private Node next;

    public Node(int data) {
        node = new TreeNode(data);
        next = null;
    }

    public Node(TreeNode treeNode) {
        node = treeNode;
        next = null;
    }
}
