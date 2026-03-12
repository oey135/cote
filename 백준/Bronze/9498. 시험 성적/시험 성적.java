import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char ch = '\0';
        switch(score/=10) {
            case 10:case 9: ch = 'A'; break;
            case 8: ch = 'B'; break;
            case 7: ch = 'C'; break;
            case 6: ch = 'D'; break;
            default: ch = 'F'; break;
        }
        System.out.println(ch);
    }
}