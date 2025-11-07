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

     int get(int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void insert(int val, int idx) {
        if(idx<0 || idx>size) System.out.println("Invalid Index !");
        else if(idx==0) addAtHead(val);
        else if(idx == size)  addAtTail(val);

        else{
        Node temp = head;
        for(int i=1;i<=idx-1;i++) {
          temp = temp.next;
        }
        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;
            size++;
        }
    }
    void delete(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;         // delete
        if(idx == size-1){
            tail = temp;                    // we are deleting tail
            size--;
        }
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

        ll.insert(45,2);
        ll.display();

        System.out.println(ll.get(4));

        ll.delete(3);
        ll.display();


    }
}
