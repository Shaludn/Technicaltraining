package week4.DataStructures.linear.LinkedList.problems;

import java.util.Stack;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class PalindromLinkedList {
    public static boolean isPalindrome(ListNode head){
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        //Traverse the list first time to push all elements into the stack
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;

        }
        temp=head;
        //Now compare the nodes with stack top elements
        while(temp!=null){
            if(temp.data!=s.pop()){
                return false;
            }
            temp=temp.next;

        }
        return true;//All the nodes have been checked, its a palindrome.
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(1);
        System.out.println(isPalindrome(head1)?"Palindrome": "Not Palindrome");

    }
}
