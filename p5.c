#include<stdio.h>
int main()
{
	int j,k,num,num1=0,num2,i,tmp,len=0,arr[10];
	//printf("\nenter number");
	
	//scanf("%d",&num);
	for(k=0;k<=500;k++)
	{
		num=k;
	num1=0;
	len=0;
	tmp = num;
	while(tmp/10>0)
	{
		len++;
		tmp=tmp/10;
	}
	len++;
	tmp= num;
	for(i=0;i<len;i++)
	{
		arr[i]=tmp%10;
		tmp=tmp/10;
	}
	for(i=0;i<len;i++)
	{
		num2=1;
		for(j=0;j<len;j++)
		{
			num2=num2*arr[i];
		}
		num1=num1+num2;
	}
	if(num1==num)
	{
		printf("\n%d number is armstrong",num);
	}
}
	//else
	//printf("not armstrong");
}
