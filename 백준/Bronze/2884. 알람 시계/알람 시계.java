import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        m -= 45;
        if(m<0) {
            h--;
            m = 60+m;
        }
        if(h<0) {
            h = 24+h;
        }
        System.out.println(h+" "+m);

    }
}