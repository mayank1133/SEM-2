#include<stdio.h>
void main()
{
	int n,rev=0,a;
	printf("enter integer:");
	scanf("%d",&n);
	while(n!=0)
	{
	    a=n%10;
	    rev=rev*10+a;
	    n/=10;
	}
	printf("reversed number of a number %d is %d ",n,rev);
}

