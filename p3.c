#include<stdio.h>
int main(){
	int a,b,c,largest;
	printf("\nenter 3 numbers");
	scanf("%d%d%d",&a,&b,&c);
	largest = (a>b?(a>c?a:c):(b>c?b:c));
	printf("largest number is %d",largest);
}
