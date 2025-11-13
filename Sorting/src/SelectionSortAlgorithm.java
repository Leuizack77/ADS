import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortAlgorithm 
{
	public static void acceptData(int arr[])
	{
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println("Enter "+i+" element: ");
			arr[i] = sc.nextInt();
		}
	}
	
	
	public static void displayArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void SelectionSort(int arr[])
	{
		for(int i=0; i<arr.length-1; i++)
		{
			int minpos = findNthMinPos(arr, i);
			int temp = arr[minpos];
			arr[minpos] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	private static int findNthMinPos(int arr[], int start)
	{
		int minpos = start;
		for(int i=start; i<arr.length; i++)
		{
			if(arr[i] < arr[minpos])
			{
				minpos = i;
			}
		}
		return minpos;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array: ");
		 int size = sc.nextInt();
		 
		 int arr[] = new int[size];
		 
		 System.out.println("Enter The Array: ");
		 SelectionSortAlgorithm.acceptData(arr);
		 
		 System.out.println("Your Array is: ");
		 SelectionSortAlgorithm.displayArray(arr);
		 
		 
		 SelectionSortAlgorithm.SelectionSort(arr);
		 System.out.println("After sorting using selection sort algorithm sorted array is: ");
		 System.out.println(Arrays.toString(arr));
	}
}
