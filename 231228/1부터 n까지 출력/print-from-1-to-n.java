import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n+1; i++) {
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}