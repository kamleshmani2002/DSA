// This is a Implimentation Of the selectionSort.

import java.util.Scanner;

public class Example_01{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print("Before sorting the array ");
        printArray(arr);
        selectionSort(arr);
        System.out.print("After sorting the array ");
        printArray(arr);
    }
    
    public static void selectionSort(int [] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            if (minIndex != i){swap(arr,i,minIndex);}
        }
    }
    public static void swap(int [] arr,int i,int j){
        arr[i] += arr[j];
        arr[j] = arr[i]-arr[j];
        arr[i] = arr[i]-arr[j];
    }

    public static void printArray(int [] arr){
        System.out.print("["+arr[0]);
        for(int i=1; i<arr.length; i++){
            System.out.print(", "+arr[i]);
        }
        System.out.println("]");
    }
}