#include<stdio.h>
void main()
{
	int i,n,m,temp;
	printf("enter the starting number:");
	scanf("%d",&m);
	printf("enter the last number:");
	scanf("%d",&n);
	for(i=m;i<=n;i++)
	{
	    m=m+i;
	}
	printf("%d",m);
	
}

