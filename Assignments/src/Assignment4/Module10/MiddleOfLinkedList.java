package Assignment4.Module10;
//LEETCODE 876- Middle of the LinkedList
class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data=data;
    }
}
public class MiddleOfLinkedList {
    static int middleoflist(Node1 head){
        Node1 slow=head;
        Node1 fast=head;
        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String[] args){
        Node1 h=new Node1(1);
        h.next=new Node1(2);
        h.next.next=new Node1(3);
        h.next.next.next=new Node1(4);
        h.next.next.next.next=new Node1(5);
        System.out.println(middleoflist(h));
    }
}

