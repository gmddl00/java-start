package operator;

public class Operator1 {
    public static void main(String[] args){
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div);

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        //문자열과 문자열 더하기1
        String result = "황" + "제";
        System.out.println(result);

        //문자열과 문자열 더하기2
        String s1 = "황";
        String s2 = "제";
        String result1 = s1 + s2;
        System.out.println(result1);

        //문자열과 숫자 더하기 1
        String result2 = "a + b = " + 25;
        System.out.println(result2);

        //문자열과 숫자 더하기 2
        int num = 25;
        String str = "a + b = ";
        String result3 = str + num;
        System.out.println(result3);

        //밑에 한줄 약어 psvm
        //public static void main(String[] args)

        int a1 = 0;

        a1 = a1 + 1;
        System.out.println("a = " + a1);

        a1 = a1 + 1;
        System.out.println("a = " + a1);

        a1 = a1 + 1;
        System.out.println("a = " + a1);

        ++a1; // a1 = a1 + 1 이랑 같음 (증감연산자)
        System.out.println("a = " + a1);

        --a1; // a1 = a1 - 1 이랑 같음 (증감연산자)
        System.out.println("a = " + a1);


    }
}