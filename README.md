# trim

- ### "trim"은 문자열(String) 객체의 앞과 뒤에 있는 공백(whitespace) 문자들을 제거하는 작업을 의미

- ### 주로 입력 받은 문자열을 처리하거나 데이터베이스에서 가져온 데이터를 정리할 때 유용하게 사용

- ## 핵심소스 코드
```java

String original = "  Hello, World!   ";
String trimmed = original.trim();

System.out.println("Original: '" + original + "'");
System.out.println("Trimmed: '" + trimmed + "'");


```