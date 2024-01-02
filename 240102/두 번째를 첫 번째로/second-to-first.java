import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] arr = input.toCharArray();
        String sec = String.valueOf(arr[1]);

        for (int i = 1; i < arr.length; i++) {
            if (sec.equals(String.valueOf(arr[i]))) {
                arr[i] = arr[0];
            }
        }

        for (int i = 0; i < input.length(); i++) {
            bw.write(String.valueOf(arr[i]));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}