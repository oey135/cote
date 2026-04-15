function solution(slice, n) {
    if(n%slice === 0) {
        return parseInt(n/slice);
    } else {
        return parseInt(n/slice+1);
    }
}