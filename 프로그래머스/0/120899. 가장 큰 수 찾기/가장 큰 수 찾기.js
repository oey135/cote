function solution(array) {
    let answer = [-1,0];
    for (const n of array) {
        if(answer[0] < n) {
            answer[0] = n;
            answer[1] = array.indexOf(n);
        }
    }
    return answer;
}