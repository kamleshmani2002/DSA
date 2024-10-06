// This is the implementation of the queue using the linkedlist

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class myQueue{
    Node Head = null;
    Node curr = null;
    int size = 0;

    public void enqueue(int data){
        if(Head == null){
            Head = new Node(data);
            curr = Head;
            size++;
            return;
        }
        curr.next = new Node(data);
        curr = curr.next;
        size++;
    }

    public void dequeue(){
        Head = Head.next;
        size--;
    }

    public int peek(){
        return Head.data;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void printQueue(){
        if(this.isEmpty()){
            System.out.println("[]");
            return;
        }
        System.out.print("["+Head.data);
        Node head = Head.next;
        while(head != null){
            System.out.print(", "+head.data);
            head = head.next;
        }
        System.out.println("]");
    }

}

public class Example_01{
    public static void main(String [] args){
        myQueue queue = new myQueue();
        queue.enqueue(3);
        queue.printQueue();
        System.out.println("peek element of the queue "+ queue.peek());
        queue.enqueue(13);
        queue.enqueue(34);
        queue.enqueue(23);
        queue.dequeue();
        System.out.println("peek element of the queue "+ queue.peek());
        queue.printQueue();
        System.out.print()
    }
}