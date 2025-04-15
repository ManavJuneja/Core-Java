package Patterns;

public class Pat2 {
    public static void main(String[] args) {
        int count = 1;
        char ch = 'A';
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j ++){
//                System.out.print("*");
//                System.out.print(j);
//                System.out.print(i);
//                System.out.print(count + " ");
//                count++;
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
