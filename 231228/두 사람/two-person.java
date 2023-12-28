import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        String input2 = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        StringTokenizer st2 = new StringTokenizer(input2);

        int age1 = Integer.parseInt(st.nextToken());
        String gen1 = st.nextToken();
        int age2 = Integer.parseInt(st2.nextToken());
        String gen2 = st2.nextToken();

        if (age1 >= 19 && "M".equals(gen1) || age2 >= 19 && "M".equals(gen2)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}