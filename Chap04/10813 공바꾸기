// 10813 공 바꾸기
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
		int num1, num2, tmp;
		for(int i=0;i<N;i++) arr[i] = i+1;
		for(int i=0;i<M;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st1.nextToken());
			num2 = Integer.parseInt(st1.nextToken());
			tmp = arr[num1-1];
			arr[num1-1] = arr[num2-1];
			arr[num2-1] = tmp;
		}
		for(int i=0;i<N;i++) bw.write(String.valueOf(arr[i]+" "));
		bw.flush();
	}
}