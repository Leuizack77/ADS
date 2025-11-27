
public class TestDoublyLinkedList {
	public static void main(String args[]) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addNode(10);
		
		list.addByPos(2, 20);
		list.addByPos(3, 30);
		list.addByPos(4, 40);
		list.addByPos(5, 50);
		
		list.addAfterValue(40, 45);
		list.display();
	}
}
