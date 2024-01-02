import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String st1 = br.readLine();
        String st2 = br.readLine();
        st1 = st1.replaceAll(" ", "");
        st2 = st2.replaceAll(" ", "");

        bw.write(st1 + st2);
        bw.flush();
        bw.close();
        br.close();
    }
}