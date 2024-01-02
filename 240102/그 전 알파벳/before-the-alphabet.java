import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int alp = input.charAt(0);

        if (alp == 97) {
            alp = 122;
        } else {
            alp--;
        }

        char result = (char)alp;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}