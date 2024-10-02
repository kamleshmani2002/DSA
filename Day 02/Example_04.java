// This is the Implimentation of the mergersort.

import java.util.Scanner;
import java.util.Arrays;

public class Example_04{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print("Before sorting the array ");
        Example_02.printArray(arr);
        arr = mergesort(arr);
        System.out.print("After sorting the array ");
        Example_02.printArray(arr);
    }
    
    public static int [] mergesort(int [] arr){
        if(arr.length <= 1){
            return arr;
        }
        int middle = arr.length/2;
        int [] leftArray  = mergesort(Arrays.copyOfRange(arr,0,middle));
        int [] rightArray = mergesort(Arrays.copyOfRange(arr,middle,arr.length));

        return merge(leftArray,rightArray);
    }
    public static int [] merge(int [] ar1 ,int [] ar2){
        int[] arr = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;

        // Merge elements from both arrays in sorted order
        while (i < ar1.length && j < ar2.length) {
            if (ar1[i] <= ar2[j]) {
                arr[k++] = ar1[i++];
            } else {
                arr[k++] = ar2[j++];
            }
        }
        // Copy remaining elements from ar1 if any
        while (i < ar1.length) {
            arr[k++] = ar1[i++];
        }
        // Copy remaining elements from ar2 if any
        while (j < ar2.length) {
            arr[k++] = ar2[j++];
        }
        return arr;
    }
}