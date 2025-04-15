package OOPS.interfacess;

public interface Animal {
    public abstract void eat();//writing access specifier is redundant
    //writing abstract is redundant
    //because it is for sure in interface you make abstract method
    void sleep();
    //now the future classes will implement the above methods

    //can add static constant also
    public static final int MAX_AGE = 150;
    //no need to add static and final because interface only have static constant so
    //So no need to mention static and final
    int MIN_AGE = 0;

    //static method
    public static void info(){
        System.out.println("This is an Animal interface");
    }

    //default method
    public default void run(){
        System.out.println("Running");
    }

}
