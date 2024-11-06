package code;

import java.util.LinkedList;

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
		next = null;
	}
}
public class ReverseLinkedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		printList(head);
		head = reverse(head);	
		printList(head);
	}
	public static void printList(Node head){
		Node curr = head;
		while(curr!=null){
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static Node reverse(Node head){
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
