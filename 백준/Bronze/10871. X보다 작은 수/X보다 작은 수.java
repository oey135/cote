import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smaller = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int temp = sc.nextInt();
            if(temp < smaller) {
                System.out.print(temp+" ");
            }
        }
    }
}