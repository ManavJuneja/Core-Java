package OOPS;
public class test2 {
    public static void main(String[] args) {
//        int x = 10;
//        System.out.println(multiplyBy10(x));
//        System.out.println(x);

        String str = "manav";
        System.out.println(upper(str));//string ka reference copy hoga and string bhi same x ko point kar raha hoo ga string pool mein phir bhi change nhi hoga kyun ki string is immutable so new string crete ho gi us particular time mein
        System.out.println(str);
    }
    public static int multiplyBy10(int x){
        return x *10;
    }
    public static String upper(String str){
        return str.toUpperCase();//
    }
}
