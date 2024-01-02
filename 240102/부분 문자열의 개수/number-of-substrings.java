import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        int cnt = 0;

        for (int i = 0; i < a.length(); i++) {
            if (String.valueOf(a.charAt(i)).equals(String.valueOf(b.charAt(0)))) {
                if (String.valueOf(a.charAt(i + 1)).equals(String.valueOf(b.charAt(1)))) {
                    cnt++;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}