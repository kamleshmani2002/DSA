// This is a Example of the bubble short.
import java.util.Scanner;

public class Example_02{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.print("Before sorting the array : ");
        printArray(arr);
        bubblesort(arr);
        System.out.print("After sorting the array : ");
        printArray(arr);

    }
    public static void bubblesort(int [] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }else{
                    break;
                }
            }
        }
    }

    public static void printArray(int [] arr){
        System.out.print("["+arr[0]);
        for(int i=1; i<arr.length; i++){
            System.out.print(", "+arr[i]);
        }
        System.out.println("]");
    }
}