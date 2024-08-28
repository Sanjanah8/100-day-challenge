#include<stdio.h>
int main()
{
    int discount,amt,d2,amt2,d3,amt3;
    scanf("%d %d %d %d %d %d",&discount,&amt,&d2,&amt2,&d3,&amt3);
    double da=amt-(amt*discount/100.0);
    double da2=amt2-(amt2*d2/100.0);
    double da3=amt3-(amt3*d3/100.0);
    double final=da+da2+da3;
    printf("%.2f",final);
    return 0;
}
