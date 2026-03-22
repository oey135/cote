import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int max = -1000001;
        int min = 1000001;
        for(int i=0; i<n; i++) {
            int t = sc.nextInt();
            if(t<min) min = t;
            if(t>max) max = t;
        }
        System.out.println(min+" "+max);
    }
}