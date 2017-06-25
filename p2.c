#include<stdio.h>
int main(){
	int a,b,i,j,k,len=0,num,arr[10];
	printf("\nEnter number");
	scanf("%d",&a);
	b=a;
	while(a/10>0)
	{
		len++;
		a=a/10;
	}
	len++;
	a=b;
	for(i=0;i<len;i++)
	{
		arr[i]=a%10;
		a=a/10;
	}
		for(i=0;i<len;i++)
		{
			printf("%d",arr[i]);
		}
}
