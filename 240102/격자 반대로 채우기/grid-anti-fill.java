import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int[][] arr = new int[n][n];
        int val = 1;

        for (int i = n - 1; i > -1 ; i--) {
            if (cnt % 2 != 0) {
                for (int j = n - 1; j > -1; j--) {
                    arr[j][i] = val;
                    val++;
                }
                cnt++;
            } else {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = val;
                    val++;
                }
                cnt++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}