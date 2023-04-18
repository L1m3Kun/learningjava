// 11005번 진법 변환 2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ox = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int index, remain;
        String ans = "";
        while (ox>=num) {
        	remain = ox % num;
        	if(remain > 9) ans = String.valueOf((char)(remain+55)) + ans;
        	else ans = Integer.toString(remain) + ans;
        	ox /= num;
        }
        if(ox > 9) ans = String.valueOf((char)(ox+55)) + ans;
    	else ans = Integer.toString(ox) + ans;
        bw.write(String.valueOf(ans));
        bw.flush();
    }
}