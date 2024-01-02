import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] arr = new String[input.length() / 2];
        int idx = 0;
        for (int i = 1; i < input.length() + 1; i++) {
            if (i % 2 == 0) {
                arr[idx] = String.valueOf(input.charAt(i - 1));
                idx++;
            }
        }

        for (int i = arr.length - 1; i > - 1 ; i--) {
            bw.write(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}