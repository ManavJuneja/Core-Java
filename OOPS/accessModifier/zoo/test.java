package OOPS.accessModifier.zoo;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.makeSound();//hard code value kari hoi ha dog class mein "Bark"
        dog.setDogSound("woof");//setDogSound -> changeDogSound -> change happen
        dog.makeSound();

    }
}
