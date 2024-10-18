package Trees;

//class Node{
//    int val;
//    Node left;
//    Node right;
//    Node(int val){    // Constructor
//        this.val = val;
//    }
//}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;  a.right = c;
        b.left = d;  b.right = e;
        c.right = f;

        System.out.println(b.val);
        System.out.println(a.left.val);
        System.out.println(a.right.val);
        a.left.right.val = 100;
        System.out.println(e.val);  // e.val = 100
        System.out.println(a.left.right.val); // e.val = 100

    }
}


