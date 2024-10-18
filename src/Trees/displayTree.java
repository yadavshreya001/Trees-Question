//Question: Display the tree

package Trees;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){    // Constructor
        this.val = val;
    }
}
public class displayTree {
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
        display(a);
    }
    private static void display(Node root){
        if(root == null){  //base case
            return;
        }
        System.out.print(root.val + " ");
        display(root.left);   //left subtree
        display(root.right); //right subtree
    }
}




