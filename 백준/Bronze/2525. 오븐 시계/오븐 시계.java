import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int need = sc.nextInt();

        m += need;
        while(m>59) {
            m-=60;
            h++;
        }
        while(h>23) {
            h-=24;
        }
        System.out.print(h+" "+m);
    }
}