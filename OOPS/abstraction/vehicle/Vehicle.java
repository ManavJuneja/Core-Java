package OOPS.abstraction.vehicle;

public abstract class Vehicle {
    int  speed;
    public abstract void accelerate();
    public abstract void de_accelerate();
    boolean hasSuperPower;
    protected Vehicle(){//no need to make public because it nonsense
        this.hasSuperPower = false;
    }

}
