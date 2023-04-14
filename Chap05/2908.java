// 2908 상수
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
		String[] input = br.readLine().split(" ");
		String[] num1 = input[0].split("");
		String[] num2 = input[1].split("");
		for(int i=2;i>=0;i--) {
			if(Integer.parseInt(num1[i]) >Integer.parseInt(num2[i])) {
				for(int j=2;j>=0;j--) bw.write(String.valueOf(num1[j]));
				break;
			}
			else if(Integer.parseInt(num1[i]) <Integer.parseInt(num2[i])) {
				for(int j=2;j>=0;j--) bw.write(String.valueOf(num2[j]));
				break;
			}
		}
		bw.flush();
		
		
		
		
	}

}
