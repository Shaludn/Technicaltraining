package week4.DataStructures.Nonlinear.Trees.Traversals.BFS;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class BinaryTree {
    public static void bfs(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        //Add the rood node into the queue and then traverse left and right
        q.add(root);
        //print all nodes level by level till the nodes is empty
        while(!q.isEmpty()){
            TreeNode temp=q.poll();//Removes and stores the front node
            System.out.print(temp.data + " ");
            //Left Subtree
            if(temp.left!=null){
                q.add(temp.left);
            }
            //Right Subtree
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Lo
        TreeNode root=new TreeNode(1);
        //Level 1
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        //Level 2
        root.left.left=new TreeNode(4);
        root.left.right= new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        //Level 3
        root.left.right.left=new TreeNode(9);
        root.right.right.left=new TreeNode(15);
        System.out.println("Bfs traversals:");
        bfs(root);

    }
}
