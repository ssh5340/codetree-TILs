import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            result += a;
        }
        String[] arr = new String[String.valueOf(result).length()];
        for (int i = 0; i < arr.length; i++) {
            if (i >= arr.length - 1) {
                arr[i] = String.valueOf(String.valueOf(result).charAt(0));
            } else {
                arr[i] = String.valueOf(String.valueOf(result).charAt(i + 1));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}