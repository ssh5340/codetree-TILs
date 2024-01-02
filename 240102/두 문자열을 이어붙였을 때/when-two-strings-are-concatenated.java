import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String a = br.readLine();
        String b = br.readLine();

        if ((a + b).equals(b + a)) {
            bw.write("true");
        } else {
            bw.write("false");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}