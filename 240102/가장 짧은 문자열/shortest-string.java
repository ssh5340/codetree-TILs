import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String st1 = br.readLine();
        String st2 = br.readLine();
        String st3 = br.readLine();

        int[] arr = {st1.length(), st2.length(), st3.length()};
        Arrays.sort(arr);

        int result = arr[2] - arr[0];

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}