/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
public class MyMain {
    public static void main(String[] args) {
        PrePostOrder prePostOrder = new PrePostOrder();
        prePostOrder.insert(40);
        prePostOrder.insert(50);
        prePostOrder.insert(30);
        prePostOrder.insert(35);
        prePostOrder.insert(100);
        prePostOrder.insert(90);
        prePostOrder.insert(12);
        prePostOrder.insert(34);
        System.out.println("PreOrder traverse :");
        prePostOrder.traversePreOrder(prePostOrder.getRoot());
        System.out.println();
        System.out.println("PostOrder traverse :");
        prePostOrder.traversePostOrder(prePostOrder.getRoot());
        System.out.println("\n");
        System.out.println("Both condition are satisfied");

    }
}
