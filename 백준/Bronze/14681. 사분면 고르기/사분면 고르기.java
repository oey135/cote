import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int quad = 0;
        if(x>0) {
            if(y>0) quad = 1;
            else quad = 4;
        }
        else {
            if(y>0) quad = 2;
            else quad = 3;
        }
        System.out.print(quad);
    }
}