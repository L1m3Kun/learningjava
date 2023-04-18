// 15650번 N과 M(2)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;


class Main{
	static int N, limit;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> stack = new ArrayList<>();
	
	public static void dfs(int i) throws IOException {
		if(stack.size()==limit) {
			if(!stack.isEmpty()) {
			for(int j=0;j<limit;j++) {
				bw.write(String.valueOf(stack.get(j)));
				bw.write(String.valueOf(" "));
			}
			bw.newLine();
			}
			return;
		}
		for(int k=i+1;k<=N;k++) {
			if (!stack.contains(k)){
				stack.add(k);
				dfs(k);
				stack.remove(stack.size()-1);
			}
		}
	}
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        limit = Integer.parseInt(st.nextToken());
        dfs(0);
        bw.flush();
    }
    
}