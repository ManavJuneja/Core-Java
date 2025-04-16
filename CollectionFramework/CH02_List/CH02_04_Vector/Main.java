package CollectionFramework.CH02_List.CH02_04_Vector;

import OOPS.abstraction.vehicle.Vehicle;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer>vector = new Vector<>();//Initial Capacity is 10
        //vector have capacity checking function
        System.out.println(vector.capacity());

        Vector<Integer>vec = new Vector<>(2,113);
        System.out.println(vec.capacity());

        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());


    }
}
