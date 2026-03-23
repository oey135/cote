import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int big = 0;
        int answer = -1;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > big) {
                big = arr[i];
                answer = i;
            }
        }
        System.out.println(big+"\n"+(answer+1));
    }
}