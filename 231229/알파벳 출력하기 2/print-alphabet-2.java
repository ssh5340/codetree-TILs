import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 65;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                bw.write("  ");
            }
            for (int j = n - i; j > 0; j--) {
                if (cnt == 91) {
                    cnt = 65;
                }
                char result = (char)cnt;
                bw.write(String.valueOf(result + " "));
                cnt++;
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}