import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        if (a > b) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }

        if (a > c) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }

        if (a > d) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }

        if (a > e) {
            bw.write(1 + "\n");
        } else {
            bw.write(0 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}