class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class myList{
    Node Head  = null;
    Node curr = null;
    int size =0;

    public boolean add(int data){
        if(Head == null){
            Head = new Node(data);
            curr = Head;
        }else{
            curr.next = new Node(data);
            curr = curr.next;
        }
        size++;
        return true;
    }

    public boolean add(int position,int data){
        if(position <0 || position > size+1){
            throw new IndexOutOfBoundsException();
        }
        else if(position == 0){
            Node node = new Node(data);
            node.next = Head;
            Head = node;
            size++;
            return true;
        }
        Node head = Head;
        Node prev = null;
        for(int i=0; i<position; i++){
            prev = head;
            head = head.next;
        }
        Node node = new Node(data);
        prev.next = node;
        node.next = head;
        if(position == size){
            curr = node;
        }
        size++;
        return true;
    }

    public boolean contains(int data){
        Node head = Head;
        while(head != null){
            if(head.data == data){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int get(int index){
        if(index <0 || index >=size){
            throw new IndexOutOfBoundsException("index "+index +" is greater than a size of list");
        }
        if(index == 0){
            return Head.data;
        }else if(index == size-1){
            return curr.data;
        }
        Node head = Head.next;
        for(int i=1; i<=index; i++){
            if(i == index){
                return head.data;
            }
            head = head.next;
        }
        return 0;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }

    public void printLIst(){
        if(size == 0){
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
        myList list = new myList();
        System.out.println(list.isEmpty());
        list.add(9);
        System.out.println(list.isEmpty());
        list.add(24);
        list.add(0,56);
        int val = list.getSize();
        list.add(val,108);
        // boolean b = list.add(-89,90);
        // System.out.println("add result of the value 90 at index -89 "+ b);
        list.printLIst();
        list.add(0,105);
        list.add(5,216);
        System.out.println("56 is prsent in the list : "+list.contains(56));
        list.printLIst();
        int v = list.get(56);
        System.out.println(0 + " index value is "+ v);
    }
}