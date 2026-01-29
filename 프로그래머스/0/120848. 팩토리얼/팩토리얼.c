#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 1;
    
    int fac = 1;
    for(int i=2; i<=10; i++) {
        fac *= i;
        if(fac <= n) answer = i;
        else break;
    }
    return answer;
}