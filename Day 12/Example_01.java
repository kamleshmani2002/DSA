public class Example_01{
    public static void main(String [] args){

    }
}

class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        return fabonacci(0,1,n-1);
    }
    public static int fabonacci(int prev ,int num,int n){
        // Base case;
        if(n == 0){
            return num;
        }
        int temp = num;
        num += prev;
        prev = temp;
        // recursive function of fabonacci.
        return fabonacci(prev,num,n-1);
    }
}