import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String result = "";
        if (n >= 500) {
            if (n >= 1000) {
                if (n >= 3000) {
                    result = "book";
                } else {
                    result = "mask";
                }
            } else {
                result = "pen";
            }
        } else {
            result = "no";
        }
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}