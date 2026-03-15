import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        int cash =0;
        for(int i=0; i<dice.length; i++) {
            dice[i] = sc.nextInt();
        }
        int[] c = new int[2];
        int max=0;
        for(int i=0; i<dice.length; i++) {
            int next = i==dice.length-1 ? 0 : i+1;
            if(dice[i]==dice[next]) {
                c[0]++;
                c[1] = dice[i];
            }
            else if(max < dice[i]){
                max = dice[i];
            }
        }
        switch (c[0]) {
            case 0: cash = max * 100; break;
            case 1: cash = c[1] * 100 + 1000; break;
            case 3: cash = c[1] * 1000 + 10000; break;
            default: break;
        }
        System.out.print(cash);
    }
}