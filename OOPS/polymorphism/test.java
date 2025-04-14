package OOPS.inheritance;

public class test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("mauli");
        d1.setAge(21);
        System.out.println(d1.getName() + d1.getAge());
        d1.speak();
    }
}
