#include<stdio.h>
void main()
{
    int n,fac=1;
    printf("enter the number n:");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        fac=fac*i;
    }
    printf("factorial of %d is %d",n,fac);
}
S