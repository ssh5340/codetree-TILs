import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        double result = Double.parseDouble(n) + 1.5;

        bw.write(String.format("%.2f", result));
        bw.flush();
        br.close();
        bw.close();
    }
}