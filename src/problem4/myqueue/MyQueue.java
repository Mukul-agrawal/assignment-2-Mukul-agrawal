/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
    private Node front, end, temp;
    private int size;

    public MyQueue() {
        front = null;
        end = null;
        temp = null;
        size = 0;
    }

    public int getSize(MyQueue queue) {
        queue.temp = queue.front;
        while (queue.temp != null) {
            ++size;
            queue.temp = queue.temp.getNext();
        }
        queue.temp = queue.front;
        return size++;
    }
}
