#include<stdio.h>

int main() {
    char n[10];
    int max_odd = -1, min_odd = 11;
    scanf("%s", n);
    for(int i = 0; n[i] != '\0'; i++) {
        int digit = n[i] - '0';
        if (digit % 2 == 1) {
            if (digit > max_odd) max_odd = digit;
            if (digit < min_odd) min_odd = digit;
        }
    }
    if (max_odd != -1) {
        printf("%d", max_odd - min_odd);
    } else {
        printf("-1");
    }
    return 0;
}
