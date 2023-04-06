// 10810 공넣기
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int i,j,k;
		for(int u=0;u<M;u++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st1.nextToken());
			j = Integer.parseInt(st1.nextToken());
			k = Integer.parseInt(st1.nextToken());
			for(int d=i-1; d<j; d++) {
				arr[d] = k;
			}
		}
		for(int u=0;u<N;u++) bw.write(String.valueOf(arr[u] + " "));
		bw.flush();
	}
}