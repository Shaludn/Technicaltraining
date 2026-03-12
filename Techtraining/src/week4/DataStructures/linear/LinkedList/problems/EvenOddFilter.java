package week4.DataStructures.linear.LinkedList.problems;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }
}
public class EvenOddFilter {
    static Node1 head=null;
    static void insert(int data){
        Node1 newNode=new Node1(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node1 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void printEven(){
        Node1 curr=head;
        while(curr!=null){
            if(curr.data%2==0){
                System.out.print( curr.data + " ");

            }
            curr=curr.next;
        }
    }
    static void printOdd(){
        Node1 curr=head;
        while(curr!=null){
            if(curr.data%2!=0){
                System.out.print( curr.data + " ");

            }
            curr=curr.next;

        }
    }
    static void display(){
        Node1 curr=head;
        while(curr!=null){
            System.out.print(curr.data + "<-->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n=s.nextInt();
        System.out.println("enter the nodes :");
        for(int i=1;i<=n;i++){
            insert(s.nextInt());
        }
        display();
        System.out.println();
        printEven();
        System.out.println();
        printOdd();

    }
}
