package week4.DataStructures.linear.Stack;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] arr=new String[MAX_SIZE];
    int top=-1;//The stack is empty
    public  boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE-1;
    }

    public  void push(String data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        else
            arr[++top]=data;
        System.out.println("The string "+ data + "is pushed into the stack");

    }
    public  String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return null;
        }
            String popped=arr[top--];
            return popped;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow. No elements to display");
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public int size(){
        return top+1;
    }
    public String peek(){
        //Intention is to fetch the top element-> not delete it.
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        StringStack s=new StringStack();
        s.pop();
        s.push("Mango");
        s.push("Apple");
        s.push("Dragon fruit");
        s.display();
        System.out.println("Top element :"+ s.peek());
        String popp=s.pop();
        System.out.println("Popped element is: "+ popp);
        s.display();
        s.size();
    }
}
