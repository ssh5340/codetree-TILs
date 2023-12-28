import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double avg = 0;
        double cnt = 0;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n < 20 || n >= 30) {
                break;
            }
            avg += n;
            cnt ++;
        }
        double result = avg / cnt;

        bw.write(String.format("%.2f", result));
        bw.flush();
        bw.close();
        br.close();
    }
}