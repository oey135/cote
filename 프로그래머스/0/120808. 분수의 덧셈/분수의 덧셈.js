function solution(numer1, denom1, numer2, denom2) {
    
    
    let numer = numer1*denom2 + numer2*denom1;
    let denom = denom1*denom2;
    
    let a=numer,b=denom;
    while(b!=0) {
        let r = a%b;
        a = b;
        b = r;
    }
    numer/=a;
    denom/=a;
    
    const answer = [numer,denom];
    
    return answer;
}