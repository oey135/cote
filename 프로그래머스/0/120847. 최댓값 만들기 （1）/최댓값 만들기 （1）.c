#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    int a=0; int b=-1;
    
    for(int i=0; i < numbers_len; i++) {
        if(i == 0)
            a = numbers[0];
        else if( numbers[i] > a ) {
            b = a;
            a = numbers[i];
        }
        else if(numbers[i] > b && numbers[i] <= a)
            b = numbers[i];
           
    }
    answer = a*b;
    return answer;
}