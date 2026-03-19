import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        
        for(int i=1; i<=line; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Case #"+i+": "+(a+b));
        }
        
    }
}