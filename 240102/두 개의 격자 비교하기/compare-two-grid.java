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

        int arr1[][] = new int[a][b];
        int arr2[][] = new int[a][b];

        for (int i = 0; i < a * 2; i++) {
            String input2 = br.readLine();
            StringTokenizer st2 = new StringTokenizer(input2);
            for (int j = 0; j < b; j++) {
                if (i < a) {
                    arr1[i][j] = Integer.parseInt(st2.nextToken());
                } else {
                    arr2[i - 4][j] = Integer.parseInt(st2.nextToken());
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    bw.write("0 ");
                } else {
                    bw.write("1 ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}