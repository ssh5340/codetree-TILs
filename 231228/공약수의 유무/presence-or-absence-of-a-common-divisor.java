import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean flag = false;

        for (int i = a; i < b + 1; i++) {
            if (960 % i == 0) {
                flag = true;
                break;
            }
        }

        String result = flag ? "1" : "0";
        bw.write(result);
        
        bw.flush();
        bw.close();
        br.close();
    }
}