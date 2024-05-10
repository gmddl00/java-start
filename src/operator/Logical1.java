package operator;

public class Logical1 {
    public static void main(String[] args) {

        //
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        //
        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        // ! 부정하는 연산자
        System.out.println("! 연산");
        System.out.println(! true);
        System.out.println(! false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);


        int a1 = 15;
        //a1는 10 보다 크고 20보다 작다
        boolean result = a1 > 10 && a1 < 20;
        System.out.println("result = " + result);
    }
}
