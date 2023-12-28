import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = n * n;

        bw.write(result + "\n");
        if (n < 5) {
            bw.write("tiny");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}