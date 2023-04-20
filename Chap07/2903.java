// 2903 중앙 이동 알고리즘
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
		int[] dp = new int[N+2];
		dp[0] = 1;
		dp[1] = 2;
		for(int i=2;i<N+2;i++) dp[i] = 2 * dp[i-1]-1; 
		bw.write(String.valueOf(dp[N+1] * dp[N+1]));
		bw.flush();
	}
}