// 10818 최소, 최대
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] V = new int[2];
		V[0] = 1000001;
		V[1] = -1000001;
		int k;
		for(int i=0;i<N;i++) {
			k = Integer.parseInt(arr[i]);
			if(V[0] > k) V[0] = k;
			if(V[1] < k) V[1] = k;
			
		}
		System.out.println(V[0]+" "+V[1]);
	}
}