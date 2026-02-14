package BinaryTrees;
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

public class Implementation {
    public static void main(String[] args) {
        //         3
        //        /  \
        //       4    2
        //      / \  / \
        //     -1  1 6  9

        Node a = new Node(3);   // root node
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b;
        a.right = c;

        b.left = d;
        b.left = e;

        c.left = f;
        c.right = g;

        display(a);
    }

    private static void display(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);     // left ki sari values print kar dega ye
        display(root.right);    // right ki sari values print kar dega ye

    }
}
