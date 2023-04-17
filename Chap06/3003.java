// 3003 킹, 퀸, 룩, 비숍, 나이트, 폰
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] white = br.readLine().split(" ");
		int[] set = {1, 1, 2, 2, 2, 8};
		int ans;
		for(int i=0;i<6;i++) {
			ans = set[i] - Integer.parseInt(white[i]);
			bw.write(String.valueOf(ans));
			bw.write(String.valueOf(" "));
			
		}
		bw.flush();
	}
}