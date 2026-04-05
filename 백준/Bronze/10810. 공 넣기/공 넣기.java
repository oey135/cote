import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 5
        int M = sc.nextInt(); // 4

        int[] basket = new int[N]; // 0~4

        for(int t=0; t<M; t++) {
            int i = sc.nextInt(); // 1
            int j = sc.nextInt(); // 2
            int k = sc.nextInt(); // 3

            for(i-=1; i<j; i++) {
                basket[i] = k;
            }
        }
        for(int i : basket) {
            System.out.print( i + " ");
        }
    }
}