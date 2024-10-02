// this is the Implimentation of the countingSort algorithm.

import java.util.Scanner;

public class Example_03{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print("Before sorting the array ");
        Example_02.printArray(arr);
        countingSort(arr);
        System.out.print("After sorting the array ");
        Example_02.printArray(arr);

    }
    public static void countingSort(int [] arr){
        // first for loop finding the max value of the array.
        int max = -1;
        for(int i : arr){
            max = Math.max(i,max);
        }
        // inilizing the array size of maxValue+1.
        int [] ar = new int[max+1];
        // calculating the count of the value.
        for(int i : arr){
            ar[i]++;
        }
        max = 0;
        for(int i=0; i<ar.length; i++){
            while(ar[i] > 0 && ar[i] != 0){
                arr[max++] = i;
                ar[i]--;
            }
        }
    }
}