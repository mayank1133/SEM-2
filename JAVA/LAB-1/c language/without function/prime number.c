#include<stdio.h>
void main()
{
	int n,count=0;
	printf("enter the number n:");
	scanf("%d",&n);
	if(n%2==0)
	{
	    count++;
	}
	if(count<=2)
	{
	    printf("given number is prime number");
	}
}

