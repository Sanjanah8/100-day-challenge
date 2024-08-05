#include <stdlib.h>
#include  <stdio.h>
int main()
{
    int N,ctr;
    scanf("%d", &N);
    for(ctr = 1; ctr <= 10; ctr++)
    {
        printf("%d ", N*ctr);
    }
    return 0;
}
