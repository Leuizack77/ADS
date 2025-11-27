public class TestSinglyLinkedList{
    public static void main(String [] args){
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.addNode(10);
        list1.addNode(20);
        list1.addNode(30);

        list1.displayData();
        
        list1.addNode(40);
        list1.displayData();
        
        list1.addByPos(1, 50);
        list1.displayData();
        
        list1.addByPos(3, 15);
        list1.displayData();
        
        list1.addAfterNum(20, 25);
        list1.displayData();
        
        list1.deleteByPos(3);
        list1.displayData();
        
        list1.deleteByPos(1);
        list1.displayData();
        
        list1.deleteByPos(5);
        list1.displayData();
    }
}
