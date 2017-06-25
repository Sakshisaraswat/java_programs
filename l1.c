#include<stdio.h>
int main(){
	int a,i=0,j,sum=0,k;
	printf("\nEnter the number");
	scanf("%d",&a);
	k=a;
	while(a/10>0)
	{
		i++;
		a=a/10;
	}
	i=i+1;
	printf("\nLEngth of number is %d",i);
	for(j=0;j<i;j++)
	{
		sum=sum+(k%10);
		k=k/10;
	}
	printf("\n%d",sum);
	
}
