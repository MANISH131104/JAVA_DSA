package LinkedList;

class Node{     // user defined data type
    int val;       // 0
    Node next;    // null
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{   // user defined data structure
    Node head;    // null
    Node tail;   // null
    int size;

    int search(int val){
        if(head==null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val==val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

//    void addAtTail(int val){
//        Node temp = new Node(val);
//        if(tail==null) head = tail = temp;
//        else {
//            tail.next = temp;
//            tail = temp;
//        }
//        size++;
//    }
    void addAtTail(int val){
        if(tail==null){
            addAtHead(val);
            return;
        }
        else{
            Node temp = new Node(val);
            tail.next = temp;
            tail = temp;
            size++;
        }
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if(head == null) tail=null;
        size--;
    }

    public void display() {
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

    }

    void addAtHead(int val) {
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);

        ll.display();

        ll.addAtHead(50);
        ll.display();

        ll.addAtHead(60);
        ll.display();

        ll.deleteAtHead();
        ll.display();

        System.out.println(ll.size);

        int idx = ll.search(20);
        System.out.println(idx);



    }
}
