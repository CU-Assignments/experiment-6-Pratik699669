import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;
    
    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String toString() {
        return name + " " + marks;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
         list.add(new Student("Alice", 80));
        list.add(new Student("Bob", 72));
        list.add(new Student("Charlie", 90));
        list.add(new Student("David", 65));
        
        List<Student> result = list.stream() 
          .filter(s -> s.marks > 75)
            .sorted((a, b) -> Double.compare(b.marks, a.marks))
            .collect(Collectors.toList());
        
        for(Student s : result) {
            System.out.println(s);
        }
        System.out.println("Name: Pratik Mishra Uid: 22bcs15965");
    }
}
