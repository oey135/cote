function solution(n) {
    let answer = 1;
    
    let fac = 1;
    for(let i=2; i<=10; i++) {
        fac *= i;
        if(fac <= n) answer = i;
        else break;
    }
    
    return answer;
}