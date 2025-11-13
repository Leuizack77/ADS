import java.util.Arrays;
import java.util.Scanner;


public class InsertionSortAlgorithm 
{
	public static void displayArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void acceptData(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter "+i+" element: ");
			arr[i] = sc.nextInt();
		}
	}
	
	public static void InsertionSort(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			int j = i-1;
			int key = arr[i];
			
			while(j >= 0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
			
			System.out.println("Iteration "+i);
			System.out.println(Arrays.toString(arr));			
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Array: ");
		int size = sc.nextInt();
		 
		int arr[] = new int[size];
		 
		System.out.println("Enter The Array: ");
		InsertionSortAlgorithm.acceptData(arr);
		 
		System.out.println("Your Array is: ");
		InsertionSortAlgorithm.displayArray(arr);
		System.out.println("-----------------------------");
		 
		 
		InsertionSortAlgorithm.InsertionSort(arr);
		System.out.println("-----------------------------");
		System.out.println("After sorting using Insertion sort algorithm sorted array is: ");
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
