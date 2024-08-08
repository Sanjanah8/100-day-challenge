#include<stdio.h>
#include<stdlib.h>

int main() {
    char n[10];
    scanf("%s", n);
    int max_diff = 0;
    for(int i = 1; n[i] != '\0'; i++) {
        int diff = abs(n[i] - n[i-1]);
        if(diff > max_diff) max_diff = diff;
    }
    printf("%d", max_diff);
    return 0;
}
