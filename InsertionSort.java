import java.util.Scanner;
class InsertionSort
{
	static void insertionSort(int arr[])
	{
		int len =arr.length;
		for(int i=0;i<len;i++)
		{
			int key = arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}


	}
	public static void main(String args[])
	{
		System.out.println("\nenter number of elements in array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]= scan.nextInt();
		}
		insertionSort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println("\nArray["+i+"]="+arr[i]);
		}

	}
}