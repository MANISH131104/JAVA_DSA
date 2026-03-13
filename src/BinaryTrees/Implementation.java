package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}
class Quad{
    int max;
    int min;
    int size;
    int sum;
    Quad(int max,int min,int size,int sum){
        this.max = max;
        this.min = min;
        this.size = size;
        this.sum  = sum;
    }
    void display(){
        System.out.println(max+" "+min+" "+size+" "+sum);
    }
        }


public class Implementation {
    public static Quad maxMinSizeSum(Node root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,0);
        Quad lst = maxMinSizeSum(root.left);
        Quad rst = maxMinSizeSum(root.right);
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.min,rst.min));
        int size = 1+lst.size+rst.size;
        int sum = root.val+lst.sum+rst.sum;
        return new Quad(max,min,size,sum);
    }
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
        b.right = e;

        c.left = f;
        c.right = g;

   //     kthLevel(a,0, 2);

//          levelOrder(a);

//        levelOrderLineWise(a);

//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);


  //      System.out.println();
//        System.out.println(size(a));
//
//        System.out.println(sum(a));
//        System.out.println(product(a));
//
//        System.out.println(max(a));
//
//        System.out.println(levels(a));

        maxMinSizeSum(a).display();
    }

    private static void kthLevel(Node root, int level, int k) {
        if(root==null) return;
        if(level==k) System.out.print(root.val+" ");
        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }

    private static void levelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            if(front.level!=currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left!=null) q.add(new Pair(front.node.left, front.level+1));
            if(front.node.right!=null) q.add(new Pair(front.node.right, front.level+1));
        }
    }

    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static int levels(Node root) {
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }

    private static int size(Node root) {
        if(root==null) return 0;
       // if(root.left==null && root.right==null) return 1;
        return 1+size(root.left)+size(root.right);
    }
    private static int sum(Node root) {
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    private static int product(Node root) {
        if(root==null) return 1;
        return root.val*sum(root.left)*sum(root.right);
    }
    private static int max(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }

    private static void preorder(Node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);     // left ki sari values print kar dega ye
        preorder(root.right);    // right ki sari values print kar dega ye
    }
    private static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
}
