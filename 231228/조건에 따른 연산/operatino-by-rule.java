import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        while (true) {
            cnt++;
            if (n % 2 == 0) {
                n = n * 3 + 1;
            } else {
                n = n * 2 + 2;
            }
            if (n >= 1000) {
                break;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}