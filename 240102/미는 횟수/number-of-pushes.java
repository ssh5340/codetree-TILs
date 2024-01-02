import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();

        int cnt = 0;

        while (cnt < input1.length()) {
            String result = "";
            for (int i = 0; i < input1.length(); i++) {
                if (i < 1) {
                    result += input1.charAt(input1.length() - 1);
                } else {
                    result += input1.charAt(i - 1);
                }
            }
            input1 = result;
            cnt++;
            if (input2.equals(result)) {
                bw.write(String.valueOf(cnt));
                break;
            } else if (cnt == input1.length()) {
                bw.write("-1");
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}