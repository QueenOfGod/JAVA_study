import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class console_IO{
    public static void main(String[] args) throws IOException{
        // InputStream in = System.in;
        // InputStreamReader reader = new InputStreamReader(in);
        // BufferedReader br = new BufferedReader(reader);

        // int a;
        // a = in.read();
        // byte[] a = new byte[3];
        // in.read(a);

        // char[] a = new char[3];
        // reader.read(a);

        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);

        // String a = br.readLine();
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
    }
}