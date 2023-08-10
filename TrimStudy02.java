import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrimStudy02 {
    public static void main(String[] args) {
        List<String> stringsWithWhitespace = Arrays.asList("  Apple  ", "  Banana  ", "  Cherry  ");

        // 문자열 리스트의 각 요소를 trim()메소드로 앞뒤 공백 제거 후 StringBuilder로 연결
        StringBuilder resultUsingStringBuilder = new StringBuilder();
        for (String str : stringsWithWhitespace) {
            resultUsingStringBuilder.append(str.trim()).append(",");
        }

        resultUsingStringBuilder.setLength(resultUsingStringBuilder.length() - 2); // 마지막 "," 제거
        System.out.println("Using StringBuilder : " + resultUsingStringBuilder.toString());

        // Stream 을 사용하여 문자열 리스트 각 요소를 trim() 메소드로 앞뒤 공백 제거 후 연결
        String resultUsingStream = stringsWithWhitespace.stream()
                .map(String::trim)
                .collect(Collectors.joining(","));
        System.out.println("Using Stream : " + resultUsingStream);
    }
    // 참고하기
    // :: 이거는 `메서드 레퍼런스` 라고 불리는아이인데
    // 마치 자바스크립트에서 변수에 메서드를 담을수있는 것처럼
    // 자바버전으로 메서드를 클래스 없이 :: 이곳에 담아서 쓸수 있다고 보면 된다.

}
