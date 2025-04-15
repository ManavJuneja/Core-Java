package OOPS.Humans;

public class Child extends Parent{
    int a = 20;
    void show(){
        System.out.println("Child variable : "+a);
        System.out.println("Parent variable : "+super.a);
    }
    public Child(){
        System.out.println("Child constructor called");
    }
    void display(){
        super.display();
        System.out.println("Display child class method");
    }
}
