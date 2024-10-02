// This is the linearSearch Implimentation

import java.util.Scanner;

public class Example_05{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int [] arr = new int[Sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Sc.nextInt();
        }
        int targetVal = Sc.nextInt();
        int result = linearSearch(arr,targetVal);
        if (result != -1)
            System.out.print("Value "+targetVal+" found at index "+result);
        else
            System.out.print("Value "+targetVal+" not found");
    }
    public static int linearSearch(int [] arr,int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}