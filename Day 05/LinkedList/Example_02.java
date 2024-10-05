class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class myCircularList{
    Node Head = null;
    Node curr = null;

    public void add(int data){
        if(Head == null){
            Head = new Node(data);
        }
    }
}

public class Example_02{
    public static void main(String [] args){
        myCircularList list = new myCircularList();
        list.add(59);

    }
}