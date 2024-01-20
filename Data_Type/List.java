import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class List{
    public static void main(String[] args){
/*
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        // 첫번째 위치에 값을 추가하고 싶다면 다음과 같이 사용할 수 있다.
        pitches.add(0, "133");

        // 두번째 인덱스의 값을 출력하고 싶다면 다음과 같이 사용할 수 있다.
        System.out.println(pitches.get(1));

        // pitches의 길이 출력
        System.out.println(pitches.size());

        // remove(객체)
        System.out.println(pitches.remove("129"));

        // remove(인덱스)
        System.out.println(pitches.remove(0));

        System.out.println(pitches);




        String[] data = {"138", "129", "142"};
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);


 */
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);

        String result = String.join(",", pitches);
        System.out.println(result);

        pitches.sort(Comparator.naturalOrder());    // 오름차순으로 정렬
        System.out.println(pitches);

        pitches.sort(Comparator.reverseOrder());    // 내림차순 정렬
        System.out.println(pitches);

    }
}