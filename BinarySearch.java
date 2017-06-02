import java.util.Scanner;




class BinarySearch
{
	static void bubbleSort(int[] arr)
	{
		int n =arr.length;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	static void binarySearch(int[] arr)
	{
		int k,mid,first,last;
		int low =0;
		int high = arr.length;
		high = high-1;
		first = arr[0];
	
		mid = (low + high)/2;
		Scanner scan = new Scanner(System.in);
		System.out.println("\nenter the number to be searched");
		k =scan.nextInt();
		while(low<=high && arr[mid]!=k)
		{
			if(k>arr[mid])
				low=mid+1;
			if(k<arr[mid])
				high =  mid-1;
			mid = (low+high)/2;

		}
		if(k==arr[mid])
		{
			System.out.println("\nElement is found at " + mid+1 +"position");
		}
		else
		{
			System.out.println("\nElement is not found");
		}

	}
	public static void main(String args[])
	{
	int n;
	System.out.println("\nEnter the number of element in array");
	Scanner scan = new Scanner(System.in);
	n=scan.nextInt();
	int arr[]= new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("\nEnterr "+ i+1 +"element");
		arr[i]=scan.nextInt();
	}
	bubbleSort(arr);
	for(int i=0;i<n;i++)
	{
		System.out.println("array element"+arr[i]);
	}
		
	binarySearch(arr);
}
}