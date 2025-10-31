package LinkedList;
import java.util.Scanner;

class Node{
    int val;       // 0
    Node next;    // null
    Node(int val){
        this.val = val;
    }
}
public class DisplayList {
    public static void displayRec(Node head){
        if(head == null) return;
        displayRec(head.next);
        System.out.print(head.val+" ");

    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();

        // by for loop
//        for(Node temp = head; temp != null; temp = temp.next){
//            System.out.print(temp.val+" ");
//        }
//        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(sc.nextInt());      // head node
        Node b = new Node(200);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

      //  display(a);

      //  displayRec(a);

        System.out.println(get(a,2));

    }
    private static int get(Node head,int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
