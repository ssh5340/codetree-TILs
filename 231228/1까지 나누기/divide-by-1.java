import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int mok = n;
        int cnt = 0;

        while (mok >= 1) {
            cnt++;
            mok /= cnt;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}