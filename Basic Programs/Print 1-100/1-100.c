#include <stdlib.h>
#include  <stdio.h>
int main()
{
    int ctr;
    for(ctr = 1; ctr < 100; ctr++)
    {
        printf("%d-", ctr);
    }
    printf("%d", ctr);
    return 0;
}
