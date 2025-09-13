class Students{
    String name;
    int rollNumber;
    double marks;

    public Students(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Students student1 = new Students("Alice", 1, 85.5);
        Students student2 = new Students("Bob", 2, 90.0);
        student1.displayDetails();
        student2.displayDetails();
    }
}
