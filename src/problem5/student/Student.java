/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    private String name;
    private int rollNo, backlog, appearingCount;
    private Scanner scanner;

    public Student() {
        scanner = new Scanner(System.in);
        System.out.print("Name : ");
        this.name = scanner.next();
        System.out.print("Roll no : ");
        this.rollNo = scanner.nextInt();
        System.out.print("Backlog_Count : ");
        this.backlog = scanner.nextInt();
        System.out.print("Appearing_Count : ");
        this.appearingCount = scanner.nextInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getAppearingCount() {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount) {
        this.appearingCount = appearingCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", backlog=" + backlog +
                ", appearingCount=" + appearingCount +
                '}';
    }
}
