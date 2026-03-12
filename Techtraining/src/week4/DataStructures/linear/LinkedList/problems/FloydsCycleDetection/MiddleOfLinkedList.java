package week4.DataStructures.linear.LinkedList.problems.FloydsCycleDetection;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}
public class MiddleOfLinkedList {
    static int middleoflist(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args){
        Node h=new Node(1);
        h.next=new Node(2);
        h.next.next=new Node(3);
        h.next.next.next=new Node(4);
        h.next.next.next.next=new Node(5);
        System.out.println(middleoflist(h));
    }
}
