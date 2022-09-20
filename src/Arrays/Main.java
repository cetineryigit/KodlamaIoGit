package Arrays;

public class Main {

    public static void main(String[] args) {


        String[] ogrenciler = {"ali", "veli", "ayse"};
        for (int i = 0; i < ogrenciler.length; i++)
            System.out.println(ogrenciler[i]);

        double[] mylist = {1.2, 1.3, 3.5, 7.9, 8.6};
        double total = 0;
        double max = 0;
        for (double number : mylist) {
            System.out.println(number);
            total = total + number;

            if (number > max)

                max = number;


        }
        System.out.println("total=" + total);
        System.out.println("max number=" + max);


    }

}

