import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a % 2 != 0) {
            a += 3;
        }

        if (a % 3 == 0) {
            a /= 3;
        }
        
        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
        br.close();
    }
}