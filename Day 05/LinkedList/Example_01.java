// This is the basic implementation of the doubly linkedList.

class Node{
    Node prev;
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class MyDublyList{
    Node Head = null;
    Node curr = null;
    int size = 0;

    public void add(int data){
        if(Head == null){
            Head = new Node(data);
            curr = Head;
        }else{
            curr.next = new Node(data);
            Node node = curr;
            curr = curr.next;
            curr.prev = node;
        }
        size++;
    }

    public void add(int index, int data){
        if(index < -1 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            Node node = new Node(data);
            Head.prev = node;
            node.next = Head;
            Head = node;
            size++;
            return;
        }else if(index == size){
            Node node = new Node(data);
            node.prev = curr;
            curr.next = node;
            curr = node;
            size++;
            return;
        }
        Node head = Head.next;
        for(int i=1; i<index; i++){
            head = head.next;
        }
        Node node = new Node(data);
        Node node1 = head.prev;
        node1.next = node;
        node.prev = node1;
        head.prev = node;
        node.next = head;
        size++;
    }

    public boolean contains(int data){
        if(Head.data == data){
            return true;
        }else if(curr.data == data){
            return true;
        }
        Node head = Head.next;
        while(head != null){
            if(head.data == data){
                return true;
            }
            head = head.next;
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
        while(head != null){
            System.out.print(", "+head.data);
            head = head.next;
        }
        System.out.println("]");
    }

    public void printList(boolean val){
        if(this.isEmpty()){
            System.out.print("[]");
            return;
        }
        if(val){
            this.printList();
        }else{
            Node node = curr.prev;
            System.out.print("["+curr.data);
            while(node != null){
                System.out.print(", "+node.data);
                node = node.prev;
            }
            System.out.println("]");
        }
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public int getSize(){
        return this.size;
    }

    public int get(int index){
        if(index < 0 || index > size){
            return -1;
        }else if(index == 0){
            return Head.data;
        }else if(index == size-1){
            return curr.data;
        }
        Node node = Head.next;
        for(int i=1; i<=index; i++){
            if(i == index){
                return node.data;
            }
            node = node.next;
        }
        return -1;
    }

    public boolean remove(int data){
        if(Head.data == data){
            Head = Head.next;
            Head.prev = null;
            size--;
            return true;
        }else if(data == curr.data){
            curr = curr.prev;
            curr.next = null;
            size--;
            return true;
        }
        Node head = Head.next;
        while(head.next != null){
            if(head.data == data){
                Node node1 = head.prev;
                node1.next = head.next;
                head = head.next;
                head.prev = node1;
                size--;
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean removeAt(int index){
        if(index < 0 || index > size){
            return false;
        }
        if(index == 0){
            Head = Head.next;
            Head.prev = null;
            size--;
            return true;
        }
        else if(index == size-1){
            curr = curr.prev;
            curr.next = null;
            size--;
            return true;
        }
        Node node = Head.next;
        for(int i=1; i<index; i++){
            node = node.next;
        }
        Node node1 = node.prev;
        node = node.next;
        node1.next = node;
        node.prev = node1;
        size--;
        return true;
    }
}

public class Example_01{
    public static void main(String [] args){
        MyDublyList list = new MyDublyList();
        list.add(89);
        list.add(80);
        list.add(23);
        list.add(243);
        list.add(123);

        list.printList(true);
        System.out.println("Element is present in list "+ list.contains(243));
        list.add(0,111);
        list.printList();
        int val = list.get(4);
        System.out.println("The value at index at 4 is "+val);
        list.remove(123);
        list.printList();
        list.removeAt(4);
        list.printList();
        list.printList(false);
    }
}