package week4.DataStructures.linear.LinkedList;
//SINGLY LINKED LIST
class LL{
    Node head;
    private int size;
    LL(){
        size=0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;//We dont know the address of next node
            size++; //Increments whenever the node is created.
        }

    }
    public void printList(){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data + " ->");
            curr=curr.next;

        }
        System.out.println("null");
    }
    public void insertAtFirst(String data){
        Node newNode= new Node(data);//Create a new node
        newNode.next=head;
        head=newNode;
    }

    public void insertAtLast(String data){
        Node newNode=new Node(data);//Create a new node

        //if the list is empty
        if(head==null){
            head=newNode;
            return;
        }
        Node last=head;
        //if there are multiple nodes, we need to find last node
        while(last.next!=null){
            last=last.next;
        }
        //at the end of this while loop, we will stand at the last node
        last.next=newNode;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty, can't delete the head!!");
            return;
        }
        //For a single node, the head will point to next()->null
        //for multiple nodes head will point to null
        head=this.head.next;
        size--;//you need to shift head, it will automatically delete the node.
    }

    public void removeLast(){
        if(head==null){
            System.out.println("List is empty, can't delete the head!!");
            return;
        }
        //if there is single element
        if(head.next==null){
            head=null;//C/c++ style ofcode//can right head=this.head.next aswell
            return;
        }
        //Multiple elements in the list
        Node curr=head;
        Node last=head.next;

        while(last.next!=null){
            curr=last;
            last=last.next;
        }
        curr.next=null;
        size--;
        return;

    }
    public void removeTarget(String target){
        if(head==null){
            System.out.println("List is empty, can't delete the target!!");
            return;
        }
        //case: target is the head node itself.
        if(head.data.equals(target)){
            head=this.head.next;
            size--;
            return;
        }
        //case: target is anywhere in the list
        Node prev=null;
        Node curr=head;

        while(curr!=null && !curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Data not founf!!");
        }
        prev.next=curr.next;
        size--;

    }
    public static void main(String[] args) {
        LL sll=new LL();
        sll.insertAtFirst("DSA");
        sll.insertAtFirst("Learning");
        sll.insertAtFirst("are");
        sll.insertAtFirst("we");
        sll.printList();
        sll.insertAtLast("in");
        sll.insertAtLast("Java");
        sll.insertAtLast("at");
        sll.insertAtLast("SCE");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removeTarget("in");
        sll.printList();

    }


}
