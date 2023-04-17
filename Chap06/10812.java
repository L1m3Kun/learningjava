// 10812 바구니 순서 바꾸기
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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N, M, begin, mid, end, tmp[], busket[], ran;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		busket = new int[N];
		for(int i=1; i<=N; i++) busket[i-1]=i;
		for(int i=0;i<M;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			begin = Integer.parseInt(st1.nextToken()) -1;
			end = Integer.parseInt(st1.nextToken()) -1;
			mid = Integer.parseInt(st1.nextToken()) -1;
			ran = mid-begin;
			tmp = new int[ran];
			for(int j=0;j<ran;j++) tmp[j] = busket[begin+j];
		
			for(int j=0;j<=end-mid;j++) busket[begin+j] = busket[mid+j];
			for(int j=0;j<ran;j++) busket[begin+end-mid+1+j] = tmp[j];
			
			
		}
		for(int i=0;i<N;i++) bw.write(String.valueOf(busket[i]+" "));
		bw.newLine();
		bw.flush();
	}
}