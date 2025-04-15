package CollectionFramework.CH02_List.CH02_02_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
public class Main3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.9));
        students.add(new Student("Bob", 4.0));
        students.add(new Student("Charlie",5.0));
        students.add(new Student("Akshit",3.2));
        students.sort((a,b) -> (int)b.getGpa() - (int)a.getGpa());
        for(Student s : students){
            System.out.println(s.getName() + " " + s.getGpa());
        }


    }
}
