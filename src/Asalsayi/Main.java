package Asalsayi;

public class Main {

    public static void main(String[] args) {

        int number1 = 17;

        boolean asalmi = true;

        for (int i = 2; i < number1; i++) {
            if (number1 % i == 0) {
                asalmi = false;
            }

        }

        if (asalmi) {
            System.out.println(number1 + " asal sayıdır");
        } else {
            System.out.println(number1 + " asal sayı değildir");
        }

    }

}
