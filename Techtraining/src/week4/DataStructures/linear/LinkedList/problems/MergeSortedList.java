package week4.DataStructures.linear.LinkedList.problems;
 class Nodee{
    int data;
    Nodee next;
    Nodee(int data){
        this.data=data;
    }
}
public class MergeSortedList {
    static Nodee merge(Nodee l1, Nodee l2){
        Nodee dummy=new Nodee(0);
        Nodee tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.data < l2.data){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null){
            tail.next=l1;
        }
        if(l2!=null){
            tail.next=l2;
        }
        return dummy.next;
    }
    static void display(Nodee head){
        while(head!=null){
            System.out.print(head.data+ " ->");
            head=head.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Nodee l1=new Nodee(1);
        l1.next=new Nodee(3);
        l1.next.next=new Nodee(5);

        Nodee l2=new Nodee(2);
        l2.next=new Nodee(4);
        l2.next.next=new Nodee(6);
        l2.next.next.next=new Nodee(8);
        Nodee merge=merge(l1, l2);
        display(merge);
    }
}
