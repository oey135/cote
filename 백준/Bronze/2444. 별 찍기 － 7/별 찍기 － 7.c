#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    // 위쪽 삼각형
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n - i; j++) printf(" ");
        for (int j = 0; j < i * 2 - 1; j++) printf("*");
        printf("\n");
    }

    // 아래쪽 삼각형
    for (int i = n - 1; i >= 1; i--) {
        for (int j = 1; j <= n - i; j++) printf(" ");
        for (int j = 0; j < i * 2 - 1; j++) printf("*");
        printf("\n");
    }

    return 0;
}