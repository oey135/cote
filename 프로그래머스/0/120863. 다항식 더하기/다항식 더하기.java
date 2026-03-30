class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] splitArr = polynomial.split(" \\+ ");
        
        int x = 0, n = 0;
        
        for(int i=0; i < splitArr.length; i++) {
            if(splitArr[i].endsWith("x")) {
                if(splitArr[i].charAt(0) == 'x') {
                    x++;
                }
                else {
                    x += Integer.parseInt(splitArr[i].substring(0,splitArr[i].length()-1));
                }
            }
            if (!splitArr[i].endsWith("x")){
                n += Integer.parseInt(splitArr[i]);
            }
        }
        //만약 x가 0이면 x는 안뜸, 수가 0이어도 없어, x=1는 x, 그외는 nx + n;
        if (x==0) {// x가 0이면, 6
            answer = ""+n;
        }
        if (n==0) {// n이 0이면, 5x
            if(x==1) {
                answer = "x";
            }
            else {
                answer = x+"x";
            }
        }
        if(n!=0 && x!=0) {
            if(x==1) {
                answer = "x + "+n;
            }
            else {
                answer = (x+"x + "+n);
            }
            
        }
        return answer;
    }
}