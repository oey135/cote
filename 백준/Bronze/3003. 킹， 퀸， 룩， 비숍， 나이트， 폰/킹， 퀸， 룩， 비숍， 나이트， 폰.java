import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] count = {1,1,2,2,2,8};
        int[] find = new int[6];
        for(int i=0; i<count.length; i++) {
            find[i] = sc.nextInt();
            find[i] = count[i] - find[i];
        }
        for(int i : find){
            System.out.print(i+" ");
        }

    }
}