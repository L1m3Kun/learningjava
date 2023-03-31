// 장훈이의 높은 선반
import java.util.*;

public class Main{
    public static int minV;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int T = 1;T <= tc;T++){
            int N = sc.nextInt();
            int B = sc.nextInt();
            int h[] = new int[N];
            for(int i=0;i<N;i++){
                h[i] = sc.nextInt();
            }
            minV = 200000;
            bt(0, N, B, 0, h);
            
            System.out.print('#');
            System.out.print(T);
            System.out.print(' ');
            System.out.println(minV-B);
        
        }
        
    }
    
    public static void bt(int i, int n, int b, int height, int[] arr){
        if(minV <= height) return;

        
        if(height >= b){
            if(minV > height){
                minV = height;
            }
            return;
        }
        
        if(i == n) return;
        
        bt(i+1, n, b, height+arr[i], arr);
        bt(i+1, n, b, height, arr);
        return;
    }
}