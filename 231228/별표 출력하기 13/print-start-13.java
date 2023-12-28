import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0) {
                for (int j = n - i / 2; j > 0 ; j--) {
                    bw.write("* ");
                }
            } else {
                for (int j = 0; j < i / 2; j++) {
                    bw.write("* ");
                }
            }
            bw.write("\n");
        }

        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < i / 2 ; j++) {
                    bw.write("* ");
                }
            } else {
                for (int j = n - i / 2; j > 0; j--) {
                    bw.write("* ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}