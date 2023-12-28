import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n);
        int result = 0;

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) {
            result = a * b;
        } else {
            result = b / a;
        }


        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}