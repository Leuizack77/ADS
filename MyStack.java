
public class MyStack {
	private int arr[];
	int top;

	public MyStack() {
		arr = new int[5];
		top = -1;
	}

	public void push(int value) {
		if (top < arr.length - 1) {
			top++;
			arr[top] = value;
		} else {
			System.out.println("Stack is full");
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int x = arr[top];
		top--;
		return x;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		if (!isEmpty()) {
			for (int i = 0; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
}
