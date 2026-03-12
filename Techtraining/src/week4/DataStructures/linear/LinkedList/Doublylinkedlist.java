package week4.DataStructures.linear.LinkedList;

import java.util.Scanner;

class Dnode{
    int data;
    Dnode next;
    Dnode prev;
    Dnode(int data){
        this.data=data;
    }
}
public class Doublylinkedlist {
    static Dnode head=null;
    static void insert(int data){
        Dnode newNode=new Dnode(data);
        if(head==null){
            head=newNode;
            return;
        }
        Dnode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp.next;

    }
    static void display() {
        Dnode temp = head;
        System.out.print("null");
        while(temp!=null){
            System.out.print(temp.data + " <-->");
            temp=temp.next;
        }
        System.out.print("null");

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no. of nodes:");
        int n=s.nextInt();
        System.out.println("enter the "+n + "nodes: ");
        for(int i=1; i<=n;i++){
            insert(s.nextInt());
        }
        display();
    }

}
