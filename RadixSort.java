import java.util.Scanner;
class Node
{
	int data;
	Node next;
}
class RadixSort
{
	 static int getMax(int arr[])
	 {
	 	int max = arr[0];
	 	for(int i=1;i<arr.length;i++)
	 	{
	 		if(arr[i]>max)
	 		{
	 			max=arr[i];
	 		}
	 	}
	 	return max;
	 }

	 static int pass(int max)
	 {
	 	int p;
	 	p=0;
	 	while(max!=0)
	 	{
	 		max=max/10;
	 		p++;
	 	}
	 	return p;
	 }

	 static void create_buc(int arr[],int s)
	 {
		Node[] start = new Node[10];
		int[] b = new int[arr.length];
		for(int i=0;i<0;i++)
		{
			start[i]=null;
		}
		for(int i=0;i<arr.length;i++)
		{
			b[i]=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<s;j++)
			{
				b[i]=b[i]/10;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int p =b[i]%10;
			Node temp = new Node();
			temp.data=arr[i];
			temp.next=null;
			if(start[p]==null)
			{
				start[p]=temp;
			}
			else
			{
				Node nptr;
				nptr =start[p];
				while(nptr.next!=null)
				{
					nptr=nptr.next;
				}
				nptr.next=temp;
			}
		}
		int l=0;
		
			for(int j=0;j<10;j++)
			{
				Node ptr;
				ptr=start[j];
				while(start[j]!=null)
				{
					arr[l]=start[j].data;
					start[j]=start[j].next;
					l++;
				}
			}
			
		
	 }
	 public static void main(String[] args) {
	 	System.out.println("\nenter array size");
	 	Scanner scan = new Scanner(System.in);
	 	int size = scan.nextInt();
	 	int arr[] = new int[size];
	 	for(int i=0;i<size;i++)
	 	{
	 		arr[i]=scan.nextInt();

	 	}
	 	int max = getMax(arr);
	 	int count = pass(max);
	 	for(int i=0;i<count;i++)
	 	{
	 		create_buc(arr,i);
	 	}
	 	for(int i=0;i<size;i++)
	 	{
	 		System.out.println(arr[i]);
	 	}
	 	
	 }
}
