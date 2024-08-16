#include<stdio.h> 
#include<stdlib.h>

int main()

{
	int n;
	scanf("%d",&n);
	int a[n]; 
	for (int i=0;i<n;i++) 
		scanf("%d",&a[i]);
	int x,y; 
	scanf("%d %d",&x,&y); 
	int r,f; 
	for (int i=0;i<n;i++)
	{
		if(a[i]%x==0)
		{
			r=i; 
			break;
		}
	}
	for (int i=n-1;i>=0;i--)
	{
		if(a[i]%y==0)
		{
			f=i; 
			break;
		}
	}

	int t=a[r]; 
	a[r]=a[f];
	a[f]=t; 
	for (int i=0;i<n;i++) 
		printf("%d ",a[i]);
}

