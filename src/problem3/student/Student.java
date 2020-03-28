package problem3.student;

public class Student {
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
