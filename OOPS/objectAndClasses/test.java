package OOPS.objectAndClasses;
public class test {
    public static void main(String[] args) {
//        int a[] = {1,23,3,4,4,5,6};
//        int b = sumOfArr(a);
//        System.out.println(b);
        String str = "    manav       ";
        String ans = changeString(str);
        System.out.println(ans);
    }
    public static String changeString(String str){
        String str1 = str.trim().toUpperCase();
        return str1;
    }
    //signature does not include return type nor access modifier
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sumOfArr(int a[]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}
