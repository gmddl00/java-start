package cond.ex;

public class Distance {
    public static void main(String[] args) {
        int Distance = 80;

        if (Distance <= 1) {
            System.out.println("도보 이용.");
        } else if (Distance <= 10) {
            System.out.println("자전거 이용.");
        } else if (Distance <= 100) {
            System.out.println("자동차 이용.");
        } else {
            System.out.println("비행기 이동.");
        }
    }
}
