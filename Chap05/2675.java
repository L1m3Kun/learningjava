// 2675 문자열 반복
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int repeat;
		String[] str;
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			repeat = Integer.parseInt(st.nextToken());
			str = st.nextToken().split("");
			for(int j=0;j<str.length;j++) {
				for(int k=0;k<repeat;k++) bw.write(String.valueOf(str[j]));
			}
			bw.newLine();
		}
		bw.flush();
		
	}

}
