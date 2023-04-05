// 1330 두수비교하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A, B;
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		if(A>B) {
			bw.write(">");
		}
		else if(A<B) {
			bw.write("<");
		}
		else {
			bw.write("==");
		}
		bw.flush();

	}

}
