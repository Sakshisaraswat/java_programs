import java.util.Scanner;
class SelectionSort
{
	static void selectionSort(int[] arr)
	{
		int min;
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			min=i;
			for(int j=i;j<length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min]=temp;

		}
      
	}
public static void main(String args[])
{
	System.out.println("\nEnter the number of element in an array");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	System.out.println("\nEnter "+ n+"elements");
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i] = scan.nextInt();

	}
	selectionSort(arr);
	for(int i=0;i<n;i++)
	{
		System.out.println("arr["+i+"]="+arr[i]);
	}

}	
}