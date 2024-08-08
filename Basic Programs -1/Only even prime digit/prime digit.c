#include<stdio.h>
#include<string.h>

int main() {
    char number[10];
    scanf("%s", number);
    if(strchr(number, '2'))
        printf("Contains Even Prime");
    else
        printf("Does Not Contain Even Prime");
    return 0;
}
