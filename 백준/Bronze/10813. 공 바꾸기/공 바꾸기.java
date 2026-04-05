import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int[] basket = new int[n];
        for(int i=0; i<n; i++) {
            basket[i] = i+1;
        }
        for(int i=0; i<L; i++) {
            int temp = 0;
            int from = sc.nextInt()-1;
            int to = sc.nextInt()-1;
            
            temp = basket[from];
            basket[from] = basket[to];
            basket[to] = temp;
        }
        for(int i : basket) {
            System.out.print(i+" ");
        }
    }
}