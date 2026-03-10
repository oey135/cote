import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] splitInt = new int[3];

        for(int i=0; i<splitInt.length; i++) {
            splitInt[i] = b%10;
            b/=10;
        }
        int sum = 0;
        for(int i=0; i<splitInt.length; i++) {
            int temp = a*splitInt[i];
            System.out.println(temp);
            sum += temp*Math.pow(10,i);
        }
        System.out.println(sum);

    }
}