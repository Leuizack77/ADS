
public class SinglyLinkedList 
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	public void addNode(int value)
	{
		Node newNode = new Node(value);
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void displayData()
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+"--->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}
	
	
	public void addByPos(int pos, int value)
	{
		Node newNode = new Node(value);
		
		if(pos == 1)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			Node temp = head;
			
			for(int i=1; temp != null && i<=pos-2; i++)
			{
				temp = temp.next;
			}
			
			if(temp != null)
			{
				newNode.next = temp.next;
				temp.next = newNode;
			}
			else
			{
				System.out.println("position is beyond the length of list");
			}
			
		}
	}
	
	
	public void addAfterNum(int num, int value)
	{
		Node newNode = new Node(value);
		
		Node temp = head;
		
		while(temp != null && temp.data != num)
		{
			temp = temp.next;
		}
		
		if(temp != null)
		{
			newNode.next = temp.next;
			temp.next = newNode;
		}
		else
		{
			System.out.println(num+" Not found");
		}
	}
	
	public void deleteByPos(int pos)
	{
		Node temp = head;
		
		if(pos == 1)
		{
			head = temp.next;
			temp.next = null;
		}
		
		else
		{
			Node prev = null;
			
			for(int i=1; temp != null && i <= pos-1; i++)
			{
				prev = temp;
				temp= temp.next;
			}
			
			if(temp != null)
			{
				prev.next = temp.next;
				temp.next = null;
			}
			else
			{
				System.out.println(pos+" position beyond the limit");
			}
		}
	}
}
