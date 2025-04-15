package Algorithms;

import java.util.Scanner;

public class CyclicSort {
    public static void cyclicSort(int arr[]){
        int n = arr.length, j = 0;
        int x = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] < x){
                x = arr[i];
            }
        }
        while(j < n){
            if(arr[j] != j+x){
                int index = arr[j] - 1;
                int temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp;
            }else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        cyclicSort(arr);
        System.out.println(arr);
    }
}
