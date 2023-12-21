class Member {
    // Data members
    protected String name;
    protected int age;
    protected String phoneNumber;
    protected String address;
    protected double salary;

    // Parameterized constructor for Member class
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary of the member
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    // Additional data members for Employee class
    private String specialization;

    // Parameterized constructor for Employee class
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {
    // Additional data members for Manager class
    private String department;

    // Parameterized constructor for Manager class
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    // Method to display manager details
    public void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagerTest {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee("Ridwan Ahmed", 20, "1", "01308379952", 50000, "Software Development");
        emp.displayDetails();
        emp.printSalary();
        System.out.println();

        // Creating a Manager object
        Manager manager = new Manager("Apurba Sarker", 35, "01742473832", "Bank colony Savar Dhaka", 80000, "Software");
        manager.displayDetails();
        manager.printSalary();
    }
}
