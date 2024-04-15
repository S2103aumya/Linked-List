import java.util.*;
public class Main
{
    public static class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static void deletenode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
       
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
    }
    public static ListNode addlast(ListNode head,int val){
        ListNode newnode=new ListNode(val);
        if(head==null){
            return newnode;
        } else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            return head;
        }
    } 
	public static void main(String[] args) {
		ListNode head=null;
		head=addlast(head,1);
		head=addlast(head,2);
		head=addlast(head,3);
		head=addlast(head,4);
		head=addlast(head,5);
		ListNode current = head;
        while (current != null && current.val != 3) {
            current = current.next;
        }
		deletenode(current);
        print(head);
	}
}