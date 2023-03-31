import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(double i=1; i>0.01; i*=0.1){
            
            double A = (num2*i)%10;
            System.out.println((int)(num1*(int)A));
            
        }
        System.out.println(num1 * num2);
        
    }
}