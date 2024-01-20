package Data_Type;

import java.util.ArrayList;
import java.util.Arrays;

public class casting_final {
    public static void main(String[] args){
/*
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);


        int n = 123;
        String num = "" + n;
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

        int n1 = 123;
        double d1 = n1;                             // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int) d2;                          // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅 해줘야한다.
        System.out.println(n2);

        String num = "123.456";
        // int n = Integer.parseInt(num);           // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.
        double n = Double.parseDouble(num);

        final int n = 123;                          // final로 설정하면 값을 바꿀 수 없다.
        // n = 456;                                 // 컴파일 오류 발생

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a = new ArrayList<>(Arrays.asList("c", "d"));       // 컴파일 오류 발생

 */
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        a.add("c");
        System.out.println(a);
    }
}