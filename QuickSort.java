import java.util.Scanner;
class QuickSort
{
	static void Sort(int arr[])
	{
		QuickSort(arr,0,arr.length-1);

	}
	static void QuickSort(int arr[],int l,int r)
	{
		int i = l;
		int j = r;
		int v = arr[(l+r)/2];
		while(i<=j)
		{
			while(arr[i]<v)
			{
				i++;
			}
			while(arr[j]>v)
			{
				j--;
			}
			if(i<=j)
			{
				int temp;
				temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
				i++;
				j--;
			}


		}
	
			if(l<j)
			QuickSort(arr,l,j);
			if(i<r)
			QuickSort(arr,i,r);
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("\nENtr element num");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		Sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}
}