import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long answer=0;
        for(int i=0; i<3; i++) {
            String temp = sc.next();
            answer += Long.parseLong(temp);
        }
        System.out.println(answer);
    }
}