#include<stdio.h>
#include<stdlib.h>

int main()
{
    int discount,amt,d2,amt2,d3,amt3;
    scanf("%d %d %d %d %d",&discount,&amt,&d2,&amt2,&d3,&amt3);
    prinf("%.2f",(amt-(amt*discount/100))+(amt2-(amt2*d2/100.00))+(amt3-(amt3*d3/100.00)))
    return 0;

}
