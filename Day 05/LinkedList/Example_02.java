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
    int size =0;

    public void add(int data){
        if(Head == null){
            Head = new Node(data);
            curr = Head;
            curr.next = Head;
            size++;
            return;
        }
        curr.next = new Node(data);
        curr = curr.next;
        curr.next = Head;
        size++;
    }

    public boolean remove(int data){ 
        if(Head == curr && Head.data == data){
            size--;
            Head = null;
            curr = null;
            return true;
        }
        if(Head.data == data){
            Head = Head.next;
            curr.next = Head;
            size--;
            return true;
        }
        Node head = Head.next;
        Node prev = Head;
        while(head != curr){
            if(head.data == data){
                head = head.next;
                prev.next = head;
                size--;
                return true;
            }
            prev = head;
            head = head.next;
        }
        if(curr.data == data){
            prev.next = Head;
            curr = prev;
            size--;
            return true;
        }
        return false;
    }

    public void printList(){
        if(this.isEmpty()){
            System.out.println("[]");
            return;
        }
        System.out.print("["+Head.data);
        Node head = Head.next;
        while(head != Head){
            System.out.print(", "+ head.data);
            head = head.next;
        }
        System.out.println("]");
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public int getSize(){
        return size;
    }

    public boolean contains(int data){
        if(Head.data == data){
            return true;
        }else if(curr.data == data){
            return true;
        }
        Node head = Head.next;
        while(head != curr){
            if(head.data == data){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            return -1;
        }
        else if(index == 0){
            return Head.data;
        }
        Node head = Head;
        for(int i=1; i<=index; i++){
            head = head.next;
        }
        return head.data;
    }

}

public class Example_02{
    public static void main(String [] args){
        myCircularList list = new myCircularList();
        list.add(59);
        list.remove(59);
        list.printList();
        list.add(80);
        list.add(67);
        list.printList();
        boolean b = list.remove(67);
        System.out.println("Element is reomve "+b);
        list.add(89);
        list.printList();
        System.out.println("Element at index 0 "+list.get(2));
    }
}