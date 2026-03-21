import java.io.*;
public class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int t = Integer.parseInt(br.readLine());

            for(int i = 0; i < t; i++){
                String str=br.readLine();
                int idx = str.indexOf(' ');
                int a = Integer.parseInt(str.substring(0,idx));
                int b = Integer.parseInt(str.substring(1+idx,str.length()));
                bw.write((a+b)+"");
                bw.newLine();
            }
            
            bw.flush();
            bw.close();
            
        } catch(IOException e){
            e.printStackTrace();
        }

    }
}