package week4.DataStructures.linear.Stack;

public class IntegerStack {
    int arr[];
    int top;
    int capacity;
    IntegerStack(int size){
        capacity=size;
        arr=new int[size];//Stack of Integers
        top=-1;
    }
    void push(int x){
        if(top==capacity-1){
            System.out.println("Stack Underflow");
            return;
        }
        arr[++top]=x;
        System.out.println("Added "+ x+ " top the top of the stack.");
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    void display(){
        if(top==-1){
            System.out.println("Stack Underflow. Nothing to display");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        IntegerStack s=new IntegerStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        System.out.println("Popped : "+ s.pop());
        s.display();
    }
}
