#include<stdio.h>
#include<stdlib.h>

int main()
{
int n,sum,unit,tenth,hundred;
scanf("%d %d",&n,&sum);
unit=n%10;
hundred=(n/10)%10;
tenth=sum-(hundred+unit);
printf("%d",(n/100)*1000+(hundred*100)+(tenth*10)+(unit));
return 0;
}
