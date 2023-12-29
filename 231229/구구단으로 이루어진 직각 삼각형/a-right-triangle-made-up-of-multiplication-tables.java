import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n - i + 2; j++) {
                int result = i * j;
                if (j == n - i + 1) {
                    bw.write(i + " * " + j + " = " + result);
                } else {
                    bw.write(i + " * " + j + " = " + result + " / ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}