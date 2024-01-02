import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        double avg = 0;
        int cnt = 0;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        String alp = br.readLine();

        for (int i = 0; i < n; i++) {
            if (arr[i].startsWith(alp)) {
                avg += arr[i].length();
                cnt++;
            }
        }

        avg = avg / (double)cnt;

        bw.write(cnt + " " + String.format("%.2f", avg));
        bw.flush();
        bw.close();
        br.close();
    }
}