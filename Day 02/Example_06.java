public class Example_06{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int [] arr = new int[Sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Sc.nextInt();
        }
        int targetVal = Sc.nextInt();
        int result = binarySearch(arr,targetVal);
        if (result != -1)
            System.out.print("Value "+targetVal+" found at index "+result);
        else
            System.out.print("Value "+targetVal+" not found");
    }
    
    public static int binarySearch(int [] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s +(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}