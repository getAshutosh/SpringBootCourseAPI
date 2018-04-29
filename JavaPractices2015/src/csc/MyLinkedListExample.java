package csc;

public class MyLinkedListExample {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.print();
	}
}
class MyLinkedList{
	Node head;
	public MyLinkedList(){
		head=null;
			
	}
	public void add(int element){
		Node temp = new Node(element);
		Node current=head;
		if(head==null){
			head=temp;
		}			
		else{
			while(current.next!=null){
				current=current.next;
			}
			current.next=temp;
		}
		
	}
	public void print(){
		Node current=head;
		while(current!=null)
		{
			System.out.println(current.element+" ");
			current=current.next;
		}
		System.out.println();
	}
	public String get(){
		return "";
	}
}

class Node{
	int element;
	Node next;
	public Node(){
		element=0;
		next=null;
	}
	public Node(int x){
		element=x;
		next=null;
	}
	public Node(int x, Node n){
		element=x;
		next=n;
	}
}

