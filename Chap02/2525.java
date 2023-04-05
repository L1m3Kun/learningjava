// 2525 오븐 시계
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st1.nextToken());
		int B = Integer.parseInt(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st2.nextToken());
		int M = B+C;
		int H = A;
		if(M >= 60) {
			int tmp = M/60; 
			if(H+tmp >=24) H = (tmp+H)%24;
			else H += tmp;
			M -= tmp*60;
		}
		System.out.printf("%d %d\n", H,M);
		
	}
}