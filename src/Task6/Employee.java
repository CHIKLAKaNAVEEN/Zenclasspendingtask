package Task6;

public class Employee extends Person {
    private int id;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String name, int age, int id, double salary) {
        super(name, age);  // Call to superclass constructor (Person)
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to raise salary by a percentage
    public void raiseSalary(double percent) {
        this.salary += (salary * percent / 100);
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: $" + salary);
    }
}