import java.util.Scanner;

public class Main {

    static void primeNumber(int a, int i) {
        if (a == i) {
            System.out.println(a + " bir asal sayidir.");
            return;
        } else if (a % i == 0) {
            System.out.println(a + "    bir asal sayi degildir.");
            return;
        }
        primeNumber(a, i + 1);
    }


    public static void main(String[] args) {
        int number;

        Scanner inp = new Scanner(System.in);

        while (true){
            System.out.print("Bir sayi giriniz:");
            number = inp.nextInt();
            primeNumber(number, 2);
        }
    }
}
