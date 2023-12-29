import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                   cnt++;
                   bw.write(cnt + " ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    cnt += 2;
                    bw.write(cnt + " ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}