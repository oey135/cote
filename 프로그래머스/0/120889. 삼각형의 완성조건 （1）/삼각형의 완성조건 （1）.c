#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 2;
    int b=0, el=0, in=0;
    for(int i=0; i<sides_len; i++) {
        if(sides[i] > b) {
            b = sides[i];
            in = i;
        }
    }
    for(int i=0; i<sides_len; i++) {
        if(i==in)
            continue;
        el += sides[i];
    }
    if(b < el)
        answer -= 1;
    return answer;
}