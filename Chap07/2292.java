// 2292 벌집
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int res =1;
		int i=0;
		int ans=0;
		while(true) {
			res += i*6;
			if(res>=N) {
				ans = i;
				break;
			}
			i++;
		}
		bw.write(String.valueOf(ans+1));
		bw.flush();
	}
}