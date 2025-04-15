package OOPS.polymorphism;

public class Dog extends Animal {
    @Override
    public void speak(){
        System.out.println("woof");
    }
    public void bye(){
        System.out.println("Bie Bie");
    }
}
