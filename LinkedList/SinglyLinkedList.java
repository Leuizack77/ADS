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

    // ADD NODE AT END
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

    // DISPLAY LIST
    public void displayData()
    {
        if(head == null)
        {
            System.out.println("Empty");
            return;
        }

        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    // ADD NODE BY POSITION
    public void addByPos(int pos, int val)
    {
        Node newNode = new Node(val);

        // insert at head
        if(pos == 1)
        {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for(int i = 1; temp != null && i < pos - 1; i++)
        {
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Position beyond list");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ADD AFTER A GIVEN NUMBER
    public void addAfterNum(int num, int value)
    {
        Node temp = head;

        // search for num
        while(temp != null && temp.data != num)
        {
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println(num + " not found");
            return;
        }

        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // DELETE BY POSITION
    public void deleteByPos(int pos)
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        if(pos == 1)
        {
            head = temp.next;
            return;
        }

        Node prev = null;

        for(int i = 1; temp != null && i < pos; i++)
        {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null)
        {
            System.out.println("Position beyond list");
            return;
        }

        prev.next = temp.next;
    }

    public static void main(String[] args)
    {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.displayData();

        list.addNode(40);
        list.displayData();

        list.addByPos(1, 50);
        list.displayData();

        list.addByPos(3, 15);
        list.displayData();

        list.addAfterNum(20, 25);
        list.displayData();

        list.deleteByPos(3);
        list.displayData();

        list.deleteByPos(1);
        list.displayData();

        list.deleteByPos(5);
        list.displayData();
    }
}
