import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);
        System.out.println(str.equals(sb.reverse().toString()) ? 1 : 0);
    }
}