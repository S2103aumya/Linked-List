import java.util.*;
public class Main
{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    static int getNthFromLast(int n)
    {
    	int size=0;
    	Node curr=head;
    	while(curr!=null){
    	    curr=curr.next;
    	    size++;
    	}
    	System.out.println("size"+" "+size);
    	int idx=1;
    	int count=size-n;
    	if(n>size){
    	    return -1;
    	}
    	curr=head;
    	if(n==size){
    	    return head.data;
    	}
    	System.out.println("count"+" "+count);
    	Node temp=head;
    	while(idx<count){
    	    temp=temp.next;
    	    idx++;
    	}
    	System.out.print(temp.data+" ");
    	return temp.next.data;
    	
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
        addElement(l1, 6);
        addElement(l1, 7);
        addElement(l1, 8);
        addElement(l1, 9);
        for (int num : l1) {
            if (head == null) {
                head = new Node(num);
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(num);
            }
        }
        System.out.println(getNthFromLast(2));
	}
}
