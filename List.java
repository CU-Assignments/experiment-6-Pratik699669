import java.util.*;

class Employee {
    String name;
    int age;
    double salary;
    
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String toString() {
        return name + " " + age + " " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", 25, 50000));
        list.add(new Employee("Bob", 30, 60000));
        list.add(new Employee("Charlie", 28, 55000));
        
        list.sort((a, b) -> Double.compare(a.salary, b.salary));
        
        for(Employee e : list) {
            System.out.println(e);
        }
        
        System.out.println("Name: Pratik Mishra Uid: 22bcs15965");
    }
}
