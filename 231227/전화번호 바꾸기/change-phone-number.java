import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String f = num.substring(4,8);
        String b = num.substring(9,13);

        bw.write("010-" + b + "-" + f);
        bw.flush();
        br.close();
        bw.close();
    }
}