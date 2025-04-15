package OOPS.accessModifier.zoo;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }
    public void makeSound(){
        System.out.println(name + "makes a sound " + sound);
    }
    protected void changeSound(String newSound){
        this.sound = newSound;
    }
}
