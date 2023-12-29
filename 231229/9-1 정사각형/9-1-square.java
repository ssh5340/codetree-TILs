import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 9;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt < 1) {
                    cnt = 9;
                }
                bw.write(String.valueOf(cnt));
                cnt--;
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}