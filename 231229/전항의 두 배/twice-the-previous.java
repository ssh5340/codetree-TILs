import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int[] arr = new int[10];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());

        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] * 2;
        }

        for (int i = 0; i < 10; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}