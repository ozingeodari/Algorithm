import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sik = br.readLine();
        int answer = 0;

        String[] splitMinus = sik.split("-");
        for (int i=0; i<splitMinus.length; i++) {
            String[] splitPlus = splitMinus[i].split("\\+");

            int add = 0;
            for (int j=0; j<splitPlus.length; j++) {
                add += Integer.parseInt(splitPlus[j]);
            }

            if (i == 0) {
                answer += add;
            } else {
                answer -= add;
            }
        }

        System.out.println(answer);
    }
}