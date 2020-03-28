package problem4.myqueue;

import problem2.main.TreeNode;

public class Node {
    private TreeNode node;

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

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
