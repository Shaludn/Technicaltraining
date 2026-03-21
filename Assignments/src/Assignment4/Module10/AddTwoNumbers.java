package Assignment4.Module10;
//LEETCODE-2 Add Two Numbers
class Nodee{
    int data;
    Nodee next;
    Nodee(int data){
        this.data=data;
    }

}
public class AddTwoNumbers {
    static Nodee head=null;
    public static Nodee addTwoNumbers(Nodee l1, Nodee l2){
        Nodee dummy=new Nodee(0);
        Nodee curr=dummy;
        int carry=0;

        while(l1!=null || l2!=null){
            int x=(l1!=null)? l1.data:0;
            int y=(l2!=null)?l2.data:0;
            int sum=x+y+carry;

            carry=sum/10;
            curr.next=new Nodee(sum%10);
            curr=curr.next;

            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if(carry>0){
            curr.next=new Nodee(carry);
        }
        return dummy.next;
    }
    static void display(){
        Nodee curr=head;
        while(curr!=null){
            System.out.print(curr.data + "<-->");
            curr=curr.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        Nodee l1=new Nodee(2);
        l1.next=new Nodee(4);
        l1.next.next=new Nodee(3);

        Nodee l2=new Nodee(5);
        l2.next=new Nodee(6);
        l2.next.next=new Nodee(4);

        head=addTwoNumbers(l1, l2);
        display();
    }
}
