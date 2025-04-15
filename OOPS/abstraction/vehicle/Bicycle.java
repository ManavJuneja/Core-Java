package OOPS.abstraction.vehicle;

public class Bicycle extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("By paddle");
    }

    @Override
    public void de_accelerate() {
        System.out.println("By hand brakes");
    }
}
