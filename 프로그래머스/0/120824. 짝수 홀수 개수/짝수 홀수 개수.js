function solution(num_list) {
    let answer = [0,0];
    for(let i=1; i<=num_list.length; i++) {
        let index = num_list[i-1]%2;
        console.log(answer);
        answer[index]++;
    }
    
    return answer;
}