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
        int c = Integer.parseInt(st.nextToken());
        
        int result = a + b + c;
        int avg = (a + b + c) / 3;
        int result2 = result - avg;

        bw.write(String.valueOf(result) + "\n");
        bw.write(String.valueOf(avg) + "\n");
        bw.write(String.valueOf(result2));
        
        bw.flush();
        br.close();
        bw.close();
    }
}