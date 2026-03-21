package Assignment4.Module10;
//LEETCODE-19 Delete nth node from the end of the list.
class ListNode1{
    int data;
    ListNode1 next;
    ListNode1(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteNthNodeFromEndOfList {
    static ListNode1 head;
    public static ListNode1 removeNthNode(ListNode1 head, int n){
        ListNode1 start=new ListNode1(0);
        ListNode1 slow=start, fast=start;
        slow.next=head;
        for(int i=1;i<=n+1; i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return start.next;

    }
    static void display(){
        ListNode1 curr=head;
        while(curr!=null) {
            System.out.print(curr.data + "<-->");
            curr = curr.next;

        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        head=new ListNode1(1);
        head.next=new ListNode1(2);
        head.next.next=new ListNode1(3);
        head.next.next.next=new ListNode1(4);
        head.next.next.next.next=new ListNode1(5);
        removeNthNode(head, 2);
        System.out.println("The list after the node deletion from the end of the list is:");
        display();
    }
}
