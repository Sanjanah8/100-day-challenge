#include<stdio.h>
#include<stdlib.h>

int main()
{
int n;
scaf("%d",&n);
int unit=n%10;
int tenth=(n/10)%10;
int hundred=(n/100)%10;
printf("%d",(n/1000)*1000+unit*100+tenth*10+hundred);
return 0;
}
