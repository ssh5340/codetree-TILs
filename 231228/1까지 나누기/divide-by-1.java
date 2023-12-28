import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine());
        double mok = n;
        double cnt = 1;

        while (true) {
            mok /= cnt;
            if (mok < 1) {
                break;
            }
            cnt++;
        }

        bw.write(String.format("%.0f", cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}