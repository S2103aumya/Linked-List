
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
    public static ListNode mergeNodes(ListNode head) {
        int sum=0;
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
            } else{
                if(sum!=0){
                    System.out.println(sum);
                    curr.next=new ListNode(sum);
                    sum=0;
                    curr=curr.next;
                }
            }
            temp=temp.next;
        }
        return dummy.next;
    }
    public static ListNode addfirst(ListNode head,int val){
        ListNode newnode=new ListNode(val);
        if(head==null){
            head=newnode;
        } else {
            newnode.next=head;
            head=newnode;
        }
        return head;
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		ListNode head=null;
		head = addfirst(head,0);
		head = addfirst(head,2);
		head = addfirst(head,5);
		head = addfirst(head,4);
		head = addfirst(head,0);
		head = addfirst(head,1);
		head = addfirst(head,3);
		head = addfirst(head,0);
		
		print(mergeNodes(head));
	}
}

