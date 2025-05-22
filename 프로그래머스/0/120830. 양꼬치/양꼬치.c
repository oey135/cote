#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    if(n>=10)
        k -= (n/10);
    int answer = (n*12000)+(k*2000);
    return answer;
}