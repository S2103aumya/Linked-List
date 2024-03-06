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
    public static int pairSum(ListNode head) {
        Stack<ListNode>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        for(ListNode m:st){
            System.out.print(m.val+" ");
        }
        ListNode curr=head;
        int ans=Integer.MIN_VALUE;
        while(curr.next!=null){
            ListNode node=st.pop();
            System.out.println("\n"+node.val+" "+curr.val);
            ans=Math.max(node.val+curr.val,ans);
            curr=curr.next;
        }
        return ans;
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
	public static void main(String[] args) {
		ListNode head=null;
		head = addfirst(head,1);
		head = addfirst(head,2);
		head = addfirst(head,4);
		head = addfirst(head,5);
		System.out.print(pairSum(head));
	}
}
