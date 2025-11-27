public class TestBinarySearchTree {

	public static void main(String[] args) 
	{
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insertNode(31);
		bst.insertNode(15);
		bst.insertNode(17);
		bst.insertNode(18);
		bst.insertNode(10);
		bst.insertNode(40);
		bst.insertNode(32);
		bst.insertNode(45);
		bst.insertNode(33);
		bst.insertNode(16);
		
		System.out.println("In Order");
		bst.inorder();
		
		System.out.println();
		
		
		System.out.println("Pre Order");
		bst.preorder();
		
		System.out.println();
		
		
		System.out.println("Post Order");
		bst.postorder();
		
		System.out.println();
		
		System.out.println("delete");
		bst.deleteNode(15);
		bst.inorder();
		
		bst.searchNode(180);
		
	}

}
