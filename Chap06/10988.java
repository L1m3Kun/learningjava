// 10988 팰린드롬인지 확인하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static int palindrome(String[] str, int N) {
		for(int i=0;i<N/2;i++) {
			if(!str[i].equals(str[N-i-1])) return 0;
			
		}
		return 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split("");
		int ans = palindrome(str, str.length);
		bw.write(String.valueOf(ans));
		bw.flush();
	}
}