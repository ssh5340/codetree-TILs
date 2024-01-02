import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < 97) {
                int result = input.charAt(i) + 32;
                bw.write(String.valueOf((char) result));
            } else {
                int result = input.charAt(i) - 32;
                bw.write(String.valueOf((char) result));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}