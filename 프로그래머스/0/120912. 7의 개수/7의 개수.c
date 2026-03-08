#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    for(int i=0; i<array_len; i++) {
        int num = array[i];
        while(num > 0) {
            int temp = num % 10;
            num /= 10;
            if(temp == 7) answer++;
        }
    }
    return answer;
}