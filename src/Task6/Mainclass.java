package Task6;

public class Mainclass {
    public static void main(String[] args) {
        // Test Person class
        Person person = new Person("Alice", 30);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        
        // Test Employee class
        Employee employee = new Employee("Bob", 40, 1234, 50000);
        employee.displayEmployeeDetails();
        employee.raiseSalary(10);  // Raise salary by 10%
        System.out.println("After Salary Raise:");
        employee.displayEmployeeDetails();
        
        // Test Circle class
        Circle circle1 = new Circle();
        circle1.displayCircleDetails();
        
        Circle circle2 = new Circle(5.0);
        circle2.displayCircleDetails();
        
        // Test Account class
        Accounts account = new Accounts(1000);  // Initial balance of 1000
        account.checkBalance();
        account.deposit(500);
        account.withdraw(300);
        account.checkBalance();
        account.withdraw(1500);  // Attempt to withdraw more than available balance
    }
}
