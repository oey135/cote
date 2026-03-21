import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        for(int i=1; i<=l; i++){
            for(int j=0; j<l-i; j++) {
                System.out.print(" ");
            }
            for(int j=l; j>l-i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}