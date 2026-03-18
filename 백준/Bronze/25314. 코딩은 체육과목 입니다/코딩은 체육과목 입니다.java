import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "int";
        for(int i=0; i<num/4; i++) str = "long " + str;
        System.out.println(str);
    }
}