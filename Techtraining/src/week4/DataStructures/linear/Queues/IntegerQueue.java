package week4.DataStructures.linear.Queues;

public class IntegerQueue {
    private static final int MAX_SIZE=5;
    private int[] arr=new int[MAX_SIZE];
    private int front, rear;

    public IntegerQueue(){
        front=rear=-1;//Queue is empty
    }
    public boolean isEmpty(){
        return(front==-1 && rear==-1);
    }
    public boolean isFull(){
        return rear==MAX_SIZE-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front=rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=rear;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        if(front==rear){
            front=rear=-1;
        }
        else{
            front++;
        }

    }



}
