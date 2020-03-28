/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements MyBinarysearchTreeADT<E> {
    public int numberOfLeftChild = 0;
    private TreeNode<E> root;
    private int maxLevel;

    public TreeNode<E> getRoot() {
        return root;
    }

    @Override
    public boolean add(E data) {
        return false;
    }

    private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
        if (currentNode == null) {
            return new TreeNode<>(data);
        } else if ((Integer) data < (Integer) currentNode.getData()) {
            currentNode.setLeftChild(addRecursive(currentNode.getLeftChild(), data));
        } else if ((Integer) data > (Integer) currentNode.getData()) {
            currentNode.setRightChild(addRecursive(currentNode.getRightChild(), data));
        }
        return currentNode;
    }

    private void printLeftChild(TreeNode<E> node, int level) {
        if (node == null) {
            return;
        }
        if (maxLevel < level) {
            System.out.println(node.getData() + " ");
        }
        maxLevel = level;
        if ((node.getLeftChild() == null)) {
            numberOfLeftChild++;
            maxLevel++;
        }
        printLeftChild(node.getLeftChild(), level + 1);
        printLeftChild(node.getRightChild(), level + 1);
    }
}
