package OOPS.interfacess;

public class test {
    public static void main(String[] args) {
        Dogs dogs = new Dogs();
        dogs.eat();
        dogs.sleep();
        //can access from obj
        System.out.println(dogs.MAX_AGE);
        //can access from animal interface also
        System.out.println(Animal.MIN_AGE);

        //can access static method Java 8
        Animal.info();

        //can access from interface
        //not like "dogs.info()" NOT POSSIBLE


        //now default method
        //can access by instance of the class
        dogs.run();
    }
}
