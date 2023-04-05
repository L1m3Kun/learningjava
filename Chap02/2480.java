// 2480 주사위 세개
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int[] dice = new int[3];
		for(int i=0; i<3;i++) {
			dice[i] = Integer.parseInt(st1.nextToken());
		}
		int ans = 0;
		if(dice[0]==dice[1] && dice[1]==dice[2]) {
			ans = 10000+ dice[0] * 1000;
		}
		else if(dice[0]==dice[1] && dice[1]!=dice[2]) ans = 1000+dice[0]*100;
		else if(dice[0]!=dice[1] && dice[1]==dice[2]) ans = 1000+dice[1]*100;
		else if(dice[0]==dice[2] && dice[1]!=dice[2]) ans = 1000+dice[0]*100;
		else {
			for(int i =0; i<3;i++) {
				if(ans < dice[i]) ans = dice[i];
			}
			ans *= 100;
		}
		System.out.println(ans);
	}
}