import java.util.*;
public class Main
{
    public static class ListNode{
        int data;
        ListNode next;
        
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode head;
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        curr=dummy;
        int count=1;
        int lastn=size-n;
        dummy.next=head;
        while(curr.next!=null && count<=lastn){
            curr=curr.next;
            count++;
        }
        if(curr.next!=null){
            curr.next=curr.next.next;
        }
        return dummy.next;
    }
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    private static void addElement(LinkedList<Integer> list, int element) {
        list.add(element);
    }
	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList();
		addElement(l1, 1);
        addElement(l1, 2);
        addElement(l1, 3);
        addElement(l1, 4);
        addElement(l1, 5);
        for (int num : l1) {
            if (head == null) {
                head = new ListNode(num);
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode(num);
            }
        }
        int n=2;
        head=removeNthFromEnd(head,n);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current=current.next;
        }

    }
}
