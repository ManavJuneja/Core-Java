package Generics;

public class main {
    public static void main(String[] args) {
//        Box<Integer> b1 = new Box<>();
//        b1.setValue(1);
//        System.out.println(b1.getValue());

        Pair<Integer, String> pair = new Pair<>(21,"Age");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        /*
        T : Type
        E : Element (Used in collections)
        V : Value (Used in maps)
        N : Number
         */
    }
}
