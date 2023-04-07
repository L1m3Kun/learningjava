// 5597 과제 안 내신 분..?
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] check = new int[31];
		int a;
		for(int i=0;i<28;i++) {
			a = Integer.parseInt(br.readLine());
			check[a] = a;
		}
		for(int i=1; i<31; i++) {
			if(check[i] != i) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
			
		}
		bw.flush();
		
	}
}