public class DoublyLinkedList 
{
	Node head;
	
	class Node
	{
		int data;
		Node prev;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	public DoublyLinkedList()
	{
		this.head = null;
	}
	
	
	public void display()
	{
		Node temp = head;
		
		if(temp == null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data+" <-> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		 
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	//ADD BY POSITION 
	public void addByPos(int pos, int data)
	{
		Node newNode = new Node(data);
		
		if(pos == 1)
		{
			newNode.next = head;
			
			if(head != null)
			{
				head.prev = newNode;
			}
			
			head = newNode;
			return;
		}
		
		Node temp = head;
		
		for(int i = 0; temp != null && i < pos-2; i++)
		{
			temp = temp.next;
		}
		
		if(temp == null)
		{
			System.out.println("Position beyond the length");
			return;
		}
		
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next = newNode;
		
		if(newNode.next != null)
		{
			newNode.next.prev = newNode;
		}
	}
	
	//ADD AFTER A VALUE
	public void addAfterValue(int value, int data)
	{
		Node newNode = new Node(data);
		Node temp = head;
		
		while(temp != null && temp.data != value)
		{
			temp = temp.next;
		}
		
		if(temp == null)
		{
			System.out.println("Value not found");
			return;
		}
		
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next = newNode;
		
		if(newNode.next != null)
		{
			newNode.next.prev = newNode;
		}
	}
	
	//DELETE BY POSITION
	public void deleteByPos(int pos)
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		if(pos == 1)
		{
			Node temp = head;
			head = head.next;
			
			if(head != null)
			{
				head.prev = null;
			}
			
			temp.next = null;
			return;
		}
		
		Node temp = head;
		
		for(int i = 1; temp != null && i < pos; i++)
		{
			temp = temp.next;
		}
		
		if(temp == null)
		{
			System.out.println("Position out of range");
			return;
		}
		
		if(temp.prev != null)
		{
			temp.prev.next = temp.next;
		}
		
		if(temp.next != null)
		{
			temp.next.prev = temp.prev;
		}
		
		temp.next = temp.prev = null;
	}
	
	
	//DELETE BY VALUE
	public void deleteByValue(int value)
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		Node temp = head;
		
		if(temp.data == value)
		{
			head = head.next;
			
			if(head != null)
			{
				head.prev = null;
			}
			
			temp.next = null;
			return;
		}
		
		while(temp != null && temp.data != value)
		{
			temp = temp.next;
		}
		
		if(temp == null)
		{
			System.out.println("Value not found");
			return;
		}
		
		if(temp.prev != null)
		{
			temp.prev.next = temp.next;
		}
		
		if(temp.next != null)
		{
			temp.next.prev = temp.prev;
		}
		
		temp.next = temp.prev = null;
	}
	
	
	//ADD BY VALUE
	public void addByValue(int value, int data) 
	{

	    Node newNode = new Node(data);
    
	    if (head == null)
	    {
	        System.out.println("List is empty");
	        return;
	    }

	    
	    if (head.data == value) 
	    {
	        newNode.next = head;
	        head.prev = newNode;
	        head = newNode;
	        return;
	    }

	    Node temp = head;

	    
	    while (temp != null && temp.data != value) 
	    {
	        temp = temp.next;
	    }

	    if (temp == null) 
	    {
	        System.out.println("Value not found");
	        return;
	    }

	    
	    newNode.next = temp;
	    newNode.prev = temp.prev;

	    temp.prev.next = newNode;
	    temp.prev = newNode;
	}
	
	
	
	public static void main(String[] args) 
	{
		DoublyLinkedList list1 = new DoublyLinkedList();
		
		System.out.println("Adding Nodes at End:");
		list1.addNode(10);
		list1.addNode(20);
		list1.addNode(30);
		list1.display();
		
		System.out.println("\nAdding node at position 1:");
		list1.addByPos(1,5);
		list1.display();
		
		System.out.println("\nAdding node at position 3:");
		list1.addByPos(3,15);
		list1.display();
		
		System.out.println("\nAdding after value 20:");
		list1.addAfterValue(20,25);
		list1.display();
		
		System.out.println("\nAdding after value 100 (not present):");
		list1.addAfterValue(100,50);
		
		System.out.println("------------------------------------------");
		
		System.out.println("\nDelete position 1:");
		list1.deleteByPos(1);
		list1.display();
		
		System.out.println("\nDelete position 3:");
		list1.deleteByPos(3);
		list1.display();
		
		System.out.println("\nDelete position 10 (invalid):");
		list1.deleteByPos(10);
		list1.display();
		
		System.out.println("\nDelete last position :");
		list1.deleteByPos(3);
		list1.display();
		
		System.out.println("----------------------------------------");
		
		
		 System.out.println("\nInsert 15 before value 20:");
	     list1.addByValue(20, 15);
	     list1.display();
		
	     System.out.println("\nInsert 5 before value 10 (head case):");
	     list1.addByValue(10, 5);
	     list1.display();
	        
	     System.out.println("\nInsert 100 before value 999 (not found):");
	     list1.addByValue(999, 100);
	     list1.display();
	     
	     System.out.println("----------------------------------------");
			 
	     System.out.println("\nDelete value 30:");
	     list1.deleteByValue(30);
	     list1.display();
	        // 5 <-> 10 <-> 15 <-> 20 <-> 40 <-> 50 <-> NULL

	     System.out.println("\nDelete value 5 (head delete):");
	     list1.deleteByValue(5);
	     list1.display();
	     
	     System.out.println("\nDelete value 999 (not found):");
	     list1.deleteByValue(999);
	     list1.display();    
	}
}
