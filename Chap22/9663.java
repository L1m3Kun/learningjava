// 9663번 N-Queen
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;


class Main{
	
	static int[][] board;
	static int[] arr1, arr2, arr3;
	static int count=0;
	

	public static void bact(int i, int N) {
		if(i == N) {
			count ++;
			return;
		}
		
		for(int j=0;j<N;j++) {
			if(arr1[j]==0 && arr2[i+j]==0 && arr3[N-1+i-j]==0) {
				arr1[j] = 1;
				arr2[i+j] = 1;
				arr3[N-1+i-j] = 1;
				bact(i+1, N);
				arr1[j] = 0;
				arr2[i+j] = 0;
				arr3[N-1+i-j] = 0;
			}
		}
		return;
		
	}
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        arr1 = new int[N];
        arr2 = new int[2*N-1];
        arr3 = new int[2*N-1];
        bact(0, N);
        bw.write(String.valueOf(count));
        bw.flush();
    }
}