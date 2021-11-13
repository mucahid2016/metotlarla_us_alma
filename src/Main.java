import java.util.Scanner;

public class Main {
    static int power(int a, int b) {
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        a = input.nextInt();
        System.out.print("Üs Değerini Giriniz : ");
        b = input.nextInt();
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç : " + result);
        return result;
    }

    public static void main(String[] args) {
        power(3, 4);
    }
}
