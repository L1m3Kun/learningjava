// 2745번 진법변환
import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        String[] num = input[0].split("");
        int n = Integer.parseInt(input[1]);
        int ans=0;
        int tmp=0;
        for(int i=0;i<num.length;i++){
        	try {
        		tmp=Integer.parseInt(num[i]);
        	}catch(Exception e){
        		tmp= (int)num[i].charAt(0)-55;
        	}

            for(int j=0;j<num.length-i-1;j++) tmp*=n;

            ans += tmp;
        }
        bw.write(String.valueOf(ans));
        bw.flush();
    }
}