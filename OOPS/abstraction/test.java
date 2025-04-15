package OOPS.abstraction;

public class test {
    public static void main(String[] args) {
        //Can take reference of abstract class
        //But can't make object of abstract class
//        Animal animal = new Animal(); //can't make because is kiski definatino nhi ha
        Animal dog = new Dog();
        dog.speak();
        Animal cat = new Cat();
        cat.speak();

    }
}
