#include<stdio.h>
#include<stdlib.h>

int main()
{
int h1,m1,h2,m2;
scanf("%d:%d %d:%d",&h1,&m1,&h2,&m2);
printf("%d:%02d",h2-h1,m2-m1);
return 0;
}
