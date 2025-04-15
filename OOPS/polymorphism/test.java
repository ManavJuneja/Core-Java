package OOPS.polymorphism;

public class test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.speak();
//        dog.bye();// can't call because reference to animal ka haa and call wahi wahi karskteh ha jo animal mein present ha
        Animal cat = new Cat();
        cat.speak();
    }
}
