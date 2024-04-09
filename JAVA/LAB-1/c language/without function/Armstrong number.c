#include <stdio.h>
#include<math.h>
void main() {
    int temp,Num, rem, result = 0;
    printf("Enter a digit integer: ");
    scanf("%d", &temp);
    Num= temp;

    while (Num != 0) {
        rem = Num % 10;
        
       result += rem*rem * rem;
        
       Num /= 10;
    }

    if (result == temp)
        printf("%d is an Armstrong number.", temp);
    else
        printf("%d is not an Armstrong number.", temp);

}