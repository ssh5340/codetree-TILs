import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String input2 = br.readLine();

        String result1 = "";
        String result2 = "";

        for (int i = 0; i < input1.length(); i++) {
            if (!((input1.charAt(i) >= 65 && input1.charAt(i) <= 90) || input1.charAt(i) >= 97 && input1.charAt(i) <= 122)) {
                result1 += input1.charAt(i);
            }
        }

        for (int i = 0; i < input2.length(); i++) {
            if (!((input2.charAt(i) >= 65 && input2.charAt(i) <= 90) || input2.charAt(i) >= 97 && input2.charAt(i) <= 122)) {
                result2 += input2.charAt(i);
            }
        }

        int result = Integer.parseInt(result1) + Integer.parseInt(result2);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}