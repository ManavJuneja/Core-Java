package OOPS.singletonPattern;

public class School {
    private static School obj;//ik object create kardia school ka
    private School(){//school ke constructor ko private kardia koi obj naa bana pae
    }

    public static School getInstance(){
        if(obj == null) {
            obj = new School();
            System.out.println("called");
        }
        return obj;
    }

}
