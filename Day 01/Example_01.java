// this is the example of the creating, accessing and initializing an array.

public Example_01{
    public static void main(String [] args){
        // creating a Array.
        int [] arr = new int[5];


        // accessing the array element.
        System.out.print(arr[0]);

        // initializing the array element.
        arr[0] = 5;

        // using for loop inilizing array element.
        for(int i=0; i<arr.length; i++){
            arr[i] = 45;
        }

        // printing the array using for loop.
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }


    }
}

/*

if we create an array and size is n then the index is in the range of 0-n where n is exclusive.

*/