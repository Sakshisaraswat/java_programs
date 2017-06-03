import java.util.Scanner;
///ss is used as key in place of origin min github
class MergeSort
{
	static void merge(int[] arr, int l, int m, int r)
	{
		System.out.println("eee");
		int l1,r1;
		l1 = m-l+1;
		r1=r-m;
		int left[] = new int[l1];
		int right[] = new int[r1];
		for(int i=0;i<l1;i++)
		{
			left[i]=arr[l+i];
		}
		for(int j=0;j<r1;j++)
		{
			right[j]=arr[m+j+1];
		}
		int index1=0;
		int index2=0;
		int index3=l;
		while(index1<l1&&index2<r1)
		{
			if(left[index1]<=right[index2])
			{
				arr[index3]=left[index1];
				index1++;
			}
			else 
			{
				arr[index3]=right[index2];
				index2++;
			}
			index3++;
		}
		
			while(index2<r1)
			{
			arr[index3]=right[index2];
			index2++;
			index3++;
			}
		
		if(index2==r1)
		{
			while(index1<l1)
			{
			arr[index3]=left[index1];
			index1++;
			index3++;
			}
		}
	}
	static void mergeSort(int arr[],int l,int r)
	{
		System.out.println("bbb");
		if(l<r)
		{
			int m = (l+r)/2;
			System.out.println("ccc");
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			System.out.println("ddd");
			merge(arr,l,m,r);
		}
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("\nEnter the number of elemnet in an array");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]= scan.nextInt();
		}
		System.out.println("aaa");
		mergeSort(arr,0,((arr.length)-1));
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}