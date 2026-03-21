package Assignment4.Module10;
//LEETCODE-206 Reverse linked list
import java.util.List;
import java.util.Scanner;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    static ListNode head;
    public static void insert(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public static void reverse(){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void display(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " <--> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter the nodes:");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        display();
        reverse();
        System.out.println("After reversing:");
        display();
    }
}