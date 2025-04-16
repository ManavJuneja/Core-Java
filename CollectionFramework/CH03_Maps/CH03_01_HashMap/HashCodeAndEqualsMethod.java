package CollectionFramework.CH03_Maps.CH03_01_HashMap;

import java.util.HashMap;
import java.util.Objects;
//GOOD PRACTICE : If in future make a custom class make sure to write its hashcode() and equals() method override karo(lik do)
public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("Alice",1);//diff memory
        Student s2 = new Student("Bob", 2);
        Student s3 = new Student("Alice", 1);//diff memory

        map.put(s1, "Engineer");//hashcode -> index
        map.put(s2,"Designer");//hashcode -> index
        map.put(s3,"Manager");//hashcode -> index

        System.out.println("Hashmap Size: " + map.size());
        System.out.println("Value of s1: "+map.get(s1));
        System.out.println("Value of s3: "+map.get(s3));
        System.out.println(s1);

        /*
Before Overriding
        Hashmap Size: 3
        Value of s1: Engineer
        Value of s3: Manager

After Overriding
        Hashmap Size: 2
        Value of s1: Manager
        Value of s3: Manager
        Id : 1, Name : Alice

         */








        //abb map mein 3 entry hogi due to new keyword

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham",90);//hashcode1 --> index1          //same memo
        map1.put("Neha", 34);//hashcode2 --> index2
        map1.put("Shubham", 99);//hashcode1 --> index1 -->equals() --> replace  //same memo
    }
}
class Student{
    private String name;
    private int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Id : " + id + ", Name : "+name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Student other = (Student) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }
}
