package OOPS.polymorphism;

public class Animal {
    private String name;
    private int age;

    public void speak(){
        System.out.println("speak");
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
