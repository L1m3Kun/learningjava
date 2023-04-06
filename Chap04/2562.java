// 2562 최댓값
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxV = 0;
		int idx, value;
		idx = 0;
		for(int i=0; i<9; i++) {
			value = Integer.parseInt(br.readLine());
			if (maxV < value) {
				idx = i+1;
				maxV = value;
			}
		}
		System.out.println(maxV + " " + idx);
		
	}
}