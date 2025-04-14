package OOPS;

public class testCat {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "bob";
        Cat cat = makeCatNameUpperCase(c);
        System.out.println(cat.name);
        System.out.println(c.name);

    }
    public static Cat makeCatNameUpperCase(Cat cat){
        cat.name = cat.name.toUpperCase();
        return cat;
    }
}
