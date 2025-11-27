
public class DoublyLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public DoublyLinkedList() {
		this.head = null;
	}
	
	
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head= newNode;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}
	
	
	
	public void addByPos(int pos, int data)
	{
		Node newNode = new Node(data);
		if(pos == 1) {
			 newNode.next = head;
			 if(head != null)
			 {
				 head.prev = newNode;
			 }
			 head = newNode;
		} else {
			Node temp = head;
			for(int i=0; temp != null && i<pos-2; i++) {
				temp = temp.next;
			}
			
			if(temp != null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				
				if(newNode.next != null) {
					newNode.next.prev = newNode;
				}
			} else {
				System.out.println("Position beyond the length");
			}
		}
	}
	
	
	public void addAfterValue(int value, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		
		while(temp != null && temp.data != value) {
			temp = temp.next;
		}
		if(temp != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
			
			if(newNode.next != null) {
				newNode.next.prev = newNode;
			}
		}
		else {
			System.out.println("Number Not Found");
		}
	}
	
	
	public void display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+"--->");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
