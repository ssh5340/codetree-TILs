import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        if (a % 3 == 0) {
            bw.write("YES" + "\n");
        } else {
            bw.write("NO" + "\n");
        }

        if (a % 5 == 0) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}