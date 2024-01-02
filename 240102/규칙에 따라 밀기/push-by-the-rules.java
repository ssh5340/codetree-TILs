import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String ctl = br.readLine();
        String[] arr = new String[input.length()];

        while (ctl.indexOf("L") != -1 && ctl.indexOf("R") != -1) {
            ctl = ctl.replace("LR", "").replace("RL", "");
        }

        if (ctl.length() >= input.length()) {
            int cnt = ctl.length() % input.length();
            ctl = ctl.substring(0, cnt);
        }

        if (ctl.startsWith("L")) {
            for (int i = 0; i < input.length(); i++) {
                if (i + ctl.length() >= input.length()) {
                    arr[i] = String.valueOf(input.charAt(i - (input.length() - ctl.length())));
                } else {
                    arr[i] = String.valueOf(input.charAt(i + ctl.length()));
                }
            }
        } else if (ctl.startsWith("R")) {
            for (int i = 0; i < input.length(); i++) {
                if (i - ctl.length() < 0) {
                    arr[i] = String.valueOf(input.charAt(input.length() + i - ctl.length()));
                } else {
                    arr[i] = String.valueOf(input.charAt(i - ctl.length()));
                }
            }
        } else {
            for (int i = 0; i < input.length(); i++) {
                arr[i] = String.valueOf(input.charAt(i));
            }
        }

        for (int i = 0; i < input.length(); i++) {
            bw.write(arr[i]);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}