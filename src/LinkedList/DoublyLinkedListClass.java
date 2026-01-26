package LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void addAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==0){
            System.out.println("List is Empty! ");
            return;
        }
        if(size==1) head = tail = null;
        else{
            head =  head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List is Empty! ");
            return;
        }
        if(size==1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void addAtIndex(int idx,int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index ! ");
            return;
        }
        if(idx == 0){
            addAtHead(val);
            return;
        }
        if(idx==size){
            addAtTail(val);
            return;
        }
        ListNode temp = head;
        ListNode a = new ListNode(val);
        for(int i=0; i<=idx-1; i++){
            temp = temp.next;
        }
       ListNode b = temp.next;
        temp.next = a;
        a.prev = temp;
        a.next = b;
        b.prev = a;
        size++;
    }
    void deleteAtIndex(int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index ! ");
            return;
        }
        if(idx == 1){
           deleteAtHead();
            return;
        }
        if(idx==size){
            deleteAtTail();
            return;
        }
        ListNode temp = head;
        for(int i=0; i<=idx-1; i++){
            temp = temp.next;
        }
        ListNode b = temp.next.next;
        temp.next = b;
        b.prev = temp;

    }
}
public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtHead(30);
        list.addAtHead(40);

        list.display();

        list.addAtTail(50);
        list.display();
     //   list.displayReverse();

        list.deleteAtHead();
        list.deleteAtTail();
        list.display();

        list.addAtIndex(3,20);
        list.display();

        list.deleteAtIndex(4);
        list.display();
    }
}
