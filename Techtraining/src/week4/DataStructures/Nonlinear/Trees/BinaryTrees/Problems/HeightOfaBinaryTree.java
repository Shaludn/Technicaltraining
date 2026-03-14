package week4.DataStructures.Nonlinear.Trees.BinaryTrees.Problems;
class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class HeightOfaBinaryTree {
    static int findHeight(Node root){
        if(root==null){
            return 0;
        }
        int leftHieght=findHeight(root.left);
        int rightHeight=findHeight(root.right);
        return Math.max(leftHieght, rightHeight)+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        System.out.println("Height of 1st tree : "+ findHeight(root));
        Node root1=null;
        System.out.println("Hright of 2nd tree: "+ findHeight(root1));
    }
}
