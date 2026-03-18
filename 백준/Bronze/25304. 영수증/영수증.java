import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;

        for(int i=0; i<n; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            answer += price*num;
        }
        System.out.println(answer==total?"Yes":"No");
    }
}