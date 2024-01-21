import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class File_Io{
    public static void main(String[] args) throws IOException{
/*
        // FileOutputStream output = new FileOutputStream("./src/JAVA_IO/out.txt");
        // FileWriter fw = new FileWriter("./src/JAVA_IO/out.txt");
        PrintWriter pw = new PrintWriter("./src/JAVA_IO/out.txt");

        for(int i = 1; i < 11; i++){
            // String data = i+"번째 줄입니다.\r\n";
            // pw.write(data.getBytes());
            String data = i+"번째 줄입니다.";
            pw.println(data);
            // fw.write(data);
        }
        pw.close();

        //FileWriter fw2 = new FileWriter("./src/JAVA_IO/out.txt", true);         // 파일을 추가 모드로 연다.
        PrintWriter pw2 = new PrintWriter(new FileWriter("./src/JAVA_IO/out.txt", true));
        for(int i = 11; i < 21; i++){
            String data = i + "번째 줄입니다.\r\n";
            pw2.write(data);
        }
        pw2.close();

        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("./src/JAVA_IO/out.txt");
        input.read(b);
        System.out.println(new String(b));                                          // byte 배열을 문자열로 변경하여 출력
        input.close();
 */
        BufferedReader br = new BufferedReader(new FileReader("./src/JAVA_IO/out.txt"));
        while(true){
            String line = br.readLine();
            if(line == null) break;                                                 // 더 이상 읽을 라인이 없을 경우 while문 나가기
            System.out.println(line);
        }
        br.close();
    }
}