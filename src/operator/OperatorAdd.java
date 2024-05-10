package operator;

public class OperatorAdd {

    public static void main(String[] args) {
        // ++a = 전위 연산자 a++ = 후위 연산자

        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; //a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        //후위 증감 연산자 사용 예
        a = 1; //값을 다시 1로 지정
        b = 0; //값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); //결과 a = 2, b = 1

        int a1 = 2;
        int b1 = 3;

        System.out.println(a1 == b1); // == 같은가?
        System.out.println(a1 != b1);
        System.out.println(a1 > b1);
        System.out.println(a1 < b1);
        System.out.println(a1 >= b1);
        System.out.println(a1 <= b1);

        //결과를 boolean 변수에 담을 수 경우
        boolean result = a1 == b1;
        System.out.println(result);

        // 문자열 사용시 ==를 equals랑 같은 뜻임
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1");  //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2);//문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}