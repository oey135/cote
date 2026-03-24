#include <stdio.h>
int main() {
    char str[1000];
    int a = 0;
    scanf("%s", &str);
    scanf("%d", &a);
    printf("%c", str[a-1]);
}