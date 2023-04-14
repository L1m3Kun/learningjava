// 1152 단어의 개수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = br.readLine().split(" ");
		int cnt =0;
		for(int i=0;i<input.length;i++) {
			if(!input[i].equals(""))cnt ++;
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		
	}

}
