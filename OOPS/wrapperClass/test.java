package OOPS.wrapperClass;

public class test {
    public static void main(String[] args) {
        int a = 10; //primitive data type
        //store in stack
        Integer b = 10;//reference variable
        //store in heap
        //b is object so
        //What happens in actual
        Integer c = Integer.valueOf(1);//autoboxing

        int d = c.intValue();//autounboxing




        Float f = 1.3f;
        Double g = 1.3;
        Character r = 'c';
        Byte bb = 1;


        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.min(3,4));
        String str = "123";
        Integer j = Integer.valueOf(str);
        System.out.println(j);
    }
}