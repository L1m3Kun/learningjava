//10811 바구니 뒤집기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] basket = new int[N+1];
		for(int i=1;i<=N;i++) {
			basket[i] = i;
		}
		int start, end;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		for(int i=0; i<M; i++) {
			tmp.clear();
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st1.nextToken());
			end = Integer.parseInt(st1.nextToken());
			for(int j=start; j<=end;j++) tmp.add(basket[j]);
			for(int j=start; j<=end;j++) basket[j] = tmp.get(end-j);
		
		}
		for(int i=1; i<=N;i++)bw.write(basket[i]+" ");
		bw.flush();
	}
}