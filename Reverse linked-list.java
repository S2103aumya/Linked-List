import java.util.*;
public class Main
{
    public static class ListNode{
        ListNode curr;
        ListNode prev;
        ListNode next;
        int data;
        ListNode(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
            this.curr=null;
        }
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static ListNode addfirst(ListNode head,int data){
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
	public static void main(String[] args) {
		ListNode head = null;
        head = addfirst(head, 5);
        head = addfirst(head, 4);
        head = addfirst(head, 3);
        head = addfirst(head, 2);
        head = addfirst(head, 1);
        
		System.out.println("Original linkedlist is :");
		print(head);
		head=reverseList(head);
		System.out.println("ReverseLinkedlist are :");
		print(head);
	}
}

