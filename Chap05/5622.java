// 5622 다이얼
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] num = br.readLine().split("");
		int tmp;
		int ans = 0;
		for(int i=0;i<num.length;i++) {
			tmp = (int) num[i].charAt(0);
//			2
			if(tmp >= 65 && tmp <= 67) ans += 3;
//			3
			else if(tmp >= 68 && tmp <= 70) ans += 4;
//			4
			else if(tmp >= 71 && tmp <= 73) ans += 5;
//			5
			else if(tmp >= 74 && tmp <= 76) ans += 6;
//			6
			else if(tmp >= 77 && tmp <= 79) ans += 7;
//			7
			else if(tmp >= 80 && tmp <= 83) ans += 8;
//			8
			else if(tmp >= 84 && tmp <= 86) ans += 9;
//			9
			else if(tmp >= 87 && tmp <= 90) ans += 10;
		}
		bw.write(String.valueOf(ans));
		bw.flush();
	}
}