class myStack{
    int [] arr = new int[10];
    int size = 0;

    public void push(int data){
        if(size == arr.length){
            int si = arr.length + arr.length/3;
            int [] arr1 = new int[si];
            for(int i=0; i<arr.length; i++){
                arr1[i] = arr[i];
            }
            arr = arr1;
        }
        arr[size++] = data;
    }
    public int peek(){
        if(size == 0){
            return -1;
        }
        return arr[size-1];
    }
    public int pop(){
        return arr[--size];
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    public void printStack(){
        System.out.print("[" + arr[size-1]);
        for(int i=size-2; i>=0; i--){
            System.out.print(", "+arr[i]);
        }
        System.out.println("]");
    }
}

public class Example_02{
    public static void main(String [] args){
        myStack stack = new myStack();
        stack.push(90);
        stack.printStack();
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.printStack();
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.printStack();
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.push(90);
        stack.printStack();
        stack.pop();
        int val = stack.getSize();
        stack.printStack();
        stack.push(78);
        System.out.println("size of my stack "+val);
        stack.printStack();
    }
}