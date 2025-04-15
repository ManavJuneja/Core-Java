package OOPS.accessModifier.zoo;

public class Dog extends Animal{
    public Dog(String name){
        super(name,"Bark");
    }
    public void wigTail(){
        System.out.println(getName()+" is wagging its tail. ");
    }
    private String getName(){
        return getClass().getSimpleName();
    }
    public void setDogSound(String newSound){
        changeSound(newSound);
    }
}
