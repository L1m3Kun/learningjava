// 9498 시험 성적
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		String ans;
		if(90<=num && num<=100) ans = "A";
		else if(80<=num && num<=89) ans = "B";
		else if(70<=num && num<=79) ans = "C";
		else if(60<=num && num<=69) ans = "D";
		else ans = "F";
		bw.write(String.valueOf(ans));
		bw.flush();
	}
}