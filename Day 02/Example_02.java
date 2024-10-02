// This is the Implimentation of the Insertion sort.

import java.util.Scanner;

public class Example_01{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int [] arr = new int[n];
        for(int i : arr){
            i+= Sc.nextInt();
        }
        System.out.print("Before printing the array ");
        printArray(arr);
        insertionSort(arr);
        System.out.print("After printing the array ");
        printArray(arr);
    }
    public static insertionSort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int val = i;
            for(int j=val-1; j>=0; j--){
                if(arr[val] < arr[j]){
                    swap(arr,val,j);
                    val--;
                }else{
                    break;
                }
            }
        }
    }
    public static void swap(int [] arr,int i,int j){
        arr[i] += arr[j];
        arr[j] = arr[i]- arr[j];
        arr[i] = arr[i]- arr[j];
    }
    public static void printArray(int [] arr){
        System.out.print("["+arr[0]);
        for(int i=1; i<arr.length; i++){
            System.out.print(", "+arr[i]);
        }
        System.out.println("]");
    }
}