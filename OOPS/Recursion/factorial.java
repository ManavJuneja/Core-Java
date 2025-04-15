package OOPS.Recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n");
        int x = scanner.nextInt();
//        int ans = fact(x);
//        System.out.println("Factorial of "+x+"is "+ans);
        int ans = sumOfFirstNatural(x);
        System.out.println(ans);

    }
    public static int fact(int x){
        if(x == 1){
            return 1;
        }
        return x * fact(x - 1);
    }
    public static int sumOfFirstNatural(int x){
        if(x == 1){
            return 1;
        }
        return x + sumOfFirstNatural(x - 1);
    }
}
