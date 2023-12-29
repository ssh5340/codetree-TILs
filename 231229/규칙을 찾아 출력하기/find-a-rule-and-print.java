import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            bw.write("* ");
        }

        bw.write("\n");

        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < i; j++) {
                bw.write("* ");
            }
            for (int j = n - i - 1; j > 0; j--) {
                bw.write("  ");
            }
            bw.write("*\n");
        }

        for (int i = 0; i < n; i++) {
            bw.write("* ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}