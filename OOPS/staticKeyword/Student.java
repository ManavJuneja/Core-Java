package OOPS.staticKeyword;

public class Student {
    static{
        System.out.println("Hello this is a static block");
    }
    public static int count = 0;
    private int id;
    private String name;
    private int age;

    public Student(){
        count++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
