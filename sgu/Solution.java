/**
* Created with IntelliJ IDEA.
* User: shenchen
* Date: 12-11-12
* Time: AM7:36
* To change this template use File | Settings | File Templates.
*/
import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class Solution implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Template().run();
    }

    public void run() {
        try {
            long t1 = System.currentTimeMillis();
                in = new BufferedReader(new InputStreamReader(System.in));
                out = new PrintWriter(System.out);
//                in = new BufferedReader(new FileReader("input.txt"));
//                out = new PrintWriter("output.txt");
            Locale.setDefault(Locale.US);
            solve();
            in.close();
            out.close();
            long t2 = System.currentTimeMillis();
            System.err.println("Time = " + (t2 - t1));
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void solve() {};

}