public class BinarySearchTree 
{
	
	Node root;
	
	class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public BinarySearchTree()
	{
		this.root = null;
	}
	
	
	public void insertNode(int key)
	{
		root = insertData(root, key);
	}


	private Node insertData(Node root, int key) 
	{
		Node newNode = new Node(key);
		
		if(root == null)
		{
			root = newNode;
			return root;
		}
		else
		{
			if(key < root.data)
			{
				root.left = insertData(root.left, key);
			}
			else
			{
				root.right = insertData(root.right, key);
			}
			return root;
		}
		
	}
	
	public void inorder()
	{
		inorderTraversal(root);
		System.out.println();
	}


	private void inorderTraversal(Node root) 
	{
		if(root != null)
		{
			inorderTraversal(root.left);
			System.out.print(root.data+", ");
			inorderTraversal(root.right);
		}
		
	}
	
	public void preorder()
	{
		preorderTraversal(root);
		System.out.println();
	}


	private void preorderTraversal(Node root) 
	{
		if(root != null)
		{
			System.out.print(root.data+", ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		
	}
	
	public void postorder()
	{
		postorderTraversal(root);
		System.out.println();
	}


	private void postorderTraversal(Node root) 
	{
		if(root != null)
		{
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+", ");
		}
		
	}
	
	public void deleteNode(int key)
	{
		root = deleteData(root, key);
	}


	private Node deleteData(Node root, int key) 
	{
		if(root == null)
		{
			return root;
		}
		else
		{
			if(key < root.data)
			{
				root.left = deleteData(root.left, key);
			}
			else if(key > root.data)
			{
				root.right = deleteData(root.right, key);
			}
			else
			{
				if(root.left == null && root.right == null)
				{
					return null;
				}
				else if(root.left == null)
				{
					return root.right;
				}
				else if(root.right == null)
				{
					return root.left;
				}
				
				root.data = minValue(root.right);
				
				root.right = deleteData(root.right, root.data);
			}
		}
		return root;
	}


	private int minValue(Node root) 
	{
		int min = root.data;
		if(root.left != null)
		{
			min = root.left.data;
			root = root.left;
		}
		return min;
	}
	
	
	public boolean searchNode(int key)
	{
		return searchBinaryTreeRecursive(root, key);
	}


	private boolean searchBinaryTreeRecursive(Node root, int key) 
	{
		if(root != null)
		{
			if(root.data == key)
			{
				System.out.println(key+" Data Found");
				return true;
			}
			else if(key < root.data)
			{
				return searchBinaryTreeRecursive(root.left, key);
			}
			else
			{
				return searchBinaryTreeRecursive(root.right, key);
			}
		}
		System.out.println(key+" Data not Found");
		return false;
	}
}
