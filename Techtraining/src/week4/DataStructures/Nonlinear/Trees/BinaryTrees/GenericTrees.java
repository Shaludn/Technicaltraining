package week4.DataStructures.Nonlinear.Trees.BinaryTrees;

public class GenericTrees<T>{
    private final T data;
    private GenericTrees<T> left;
    private GenericTrees<T>right;

    public GenericTrees(T data){
        this.data=data;
        this.left=this.right=null;
    }
    void preOrder(){
        System.out.print(this.data+ " ");
        if(this.left!=null)
            this.left.preOrder();
        if(this.right!=null)
            this.right.preOrder();
    }

    void inOrder(){
        if(this.left!=null) this.left.inOrder();
        System.out.print(this.data + " ");
        if(this.right!=null) this.right.inOrder();
    }
    void postOrder(){
        if(this.left!=null) this.left.postOrder();
        if(this.right!=null) this.right.postOrder();
        System.out.print(this.data+ " ");
    }
    public static void main(String[] args) {
        //tree of integers;
        GenericTrees<Integer> g=new GenericTrees<>(1);
        g.left=new GenericTrees<>(2);
        g.right=new GenericTrees<>(3);
        System.out.println("Preorder integer tree :");
        g.preOrder();
        System.out.println();
        System.out.println("Post order:");
        g.postOrder();
        System.out.println();
        System.out.println("Inorder tree:");
        g.inOrder();
        System.out.println();

        //Trees of Strings
        GenericTrees<String> g1=new GenericTrees<>("Java");
        g1.left=new GenericTrees<>("C");
        g1.right=new GenericTrees<>("C++");
        System.out.println("Preorder integer tree :");
        g1.preOrder();
        System.out.println();
        System.out.println("Post order:");
        g1.postOrder();
        System.out.println();
        System.out.println("Inorder tree:");
        g1.inOrder();
        System.out.println();

    }
}
