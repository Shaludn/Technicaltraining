package week4.DataStructures.linear.LinkedList.problems;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
    }
}
public class ReverseLinkedList {
    static Node head;
    static void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return;
    }

    static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<-->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of nodes :");
        int n=s.nextInt();
        System.out.println("enter the nodes: ");
        for(int i=1;i<=n;i++){
            insert(s.nextInt());
        }
        display();
        reverse();
        System.out.println();
        display();
    }
}
