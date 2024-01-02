import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int row = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[][] arr = new int[row][row];

        for (int i = 0; i < cnt; i++) {
            String rowcnt = br.readLine();
            StringTokenizer st2 = new StringTokenizer(rowcnt);

            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());

            arr[a - 1][b - 1] = a * b;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}