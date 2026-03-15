#include <stdio.h>
int main() {
    int h=0,m=0,n=0;
    scanf("%d %d", &h,&m);
    scanf("%d", &n);
    
    m+=n;
    while(m>59) {
        h++;
        m-=60;
    }
    while(h>23) {
        h-=24;
    }
    printf("%d %d", h,m);
    return 0;
}