class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class myStack{
    Node Peek = null;
    int size = 0;

    public void push(int data){
        if(Peek == null){
            Peek = new Node(data);
            size++;
        }else{
            Node node = new Node(data);
            node.next = Peek;
            Peek = node;
            size++;
        }
    }

    public int peek(){
        return Peek.data;
    }

    public int pop(){
        int val = Peek.data;
        Peek = Peek.next;
        size--;
        return val;
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }

    public int getSize(){
        return this.size;
    }

    public void printStack(){
        System.out.print("["+Peek.data);
        Node peek = Peek.next;
        while(peek != null){
            System.out.print(", "+peek.data);
            peek = peek.next;
        }
        System.out.println("]");
    }
}

public class Example_01{
    public static void main(String [] args){
        myStack stack = new myStack();
        System.out.println.
        stack.push(67);
        stack.push(90);
        stack.printStack();
        int val = stack.peek();
        System.out.println(val);
        stack.pop();
        stack.printStack();
        stack.push(23);
        stack.printStack();
        int size = stack.getSize();
        System.out.println("This is the size of the Stack "+size);
    }
}