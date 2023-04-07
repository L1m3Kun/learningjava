// 25083 새싹
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;



public class Main{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(String.valueOf("         ,r'\"7"));
		bw.newLine();
		bw.write(String.valueOf("r`-_   ,'  ,/"));
		bw.newLine();
		bw.write(String.valueOf(" \\. \". L_r'"));
		bw.newLine();
		bw.write(String.valueOf("   `~\\/"));
		bw.newLine();
		bw.write(String.valueOf("      |"));
		bw.newLine();
		bw.write(String.valueOf("      |"));
		bw.flush();
		
	}
}