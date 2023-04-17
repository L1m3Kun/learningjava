// 2444 별 찍기 - 7
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-1-i;j++) bw.write(String.valueOf(" "));
			for(int j=0;j<i;j++) bw.write(String.valueOf("*"));
			bw.write(String.valueOf("*"));
			for(int j=0;j<i;j++) bw.write(String.valueOf("*"));
			bw.newLine();
		}
		for(int i=num-2;i>=0;i--) {
			for(int j=0;j<num-1-i;j++) bw.write(String.valueOf(" "));
			for(int j=0;j<i;j++) bw.write(String.valueOf("*"));
			bw.write(String.valueOf("*"));
			for(int j=0;j<i;j++) bw.write(String.valueOf("*"));
			bw.newLine();
		}
		bw.flush();
	}
}