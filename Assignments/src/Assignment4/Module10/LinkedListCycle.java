package Assignment4.Module10;
//LETCODE 141- LinkedListCycle
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }

}
public class LinkedListCycle{
    static node head=null;

    static void createList(){
        head=new node(10);
        head.next=new node(20);
        head.next.next=new node(30);
        head.next.next.next=new node(40);
        head.next.next.next.next=head.next;//cycle created
    }
    static boolean isCycle(){
        node slow= head;
        node fast= head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;//cycle detected
        }
        return false;//no cycle detected
    }
    public static void main(String[] args) {

        createList();
        if(isCycle()) {
            System.out.println("Cycle detected");
        }
        else
            System.out.println("No cycle");
    }

}
