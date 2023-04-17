// 1157 단어 공부
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split("");
		int[] cnt = new int[26];
		for(int i=0; i<26; i++) cnt[i]=0;
		for(int i=0;i<str.length;i++) str[i] = str[i].toUpperCase();
		for(int i=0;i<str.length;i++) {
			cnt[(int)str[i].charAt(0) - 65] ++;
		}
		int maxV = 0;
		for(int i=1;i<26;i++) {
			if(cnt[maxV] < cnt[i]) maxV = i;
		}
		String ans = Character.toString((char)(maxV+65));
		 
		for(int i=0;i<26;i++) {
			if(cnt[maxV] == cnt[i] && maxV != i) ans="?";
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		
	}
}