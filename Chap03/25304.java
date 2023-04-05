// 25304 영수증
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int res = 0;
		int price, num;
		for(int i=0; i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			price = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			res += price*num;
		}
		if(res == X) System.out.println("Yes");
		else System.out.println("No");
	}
}