class myQueue{
    int [] arr;
    int size =0;
    
    myQueue(){
        arr = new int[10];
    }

    public void enqueue(int data){
        if(arr.length <= size){
            arr = java.util.Arrays.copyOf(arr,arr.length+arr.length/2);
        }
        arr[size++] = data;
    }

    public void dequeue(){
        arr = java.util.Arrays.copyOfRange(arr,1,arr.length);
        size--;
    }
    public int getSize(){
        return size;
    }
    public int peek(){
        return arr[0];
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public void printQueue(){
        if(size == 0){
            System.out.println("[]");
            return;
        }
        System.out.print("["+ arr[0]);
        for(int i=1; i<size; i++){
            System.out.print(", "+arr[i]);
        }
        System.out.println("]");
    }

}

public class Example_02{
    public static void main(String [] args){
        myQueue queue = new myQueue();
        queue.enqueue(89);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();


    }
}