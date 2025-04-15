package OOPS.interfacess;

public class Dogs implements Animal{

    @Override
    public void eat() {
        System.out.println("dog Eating");
    }

    @Override
    public void sleep() {
        System.out.println("dog Sleeping");
    }
}
