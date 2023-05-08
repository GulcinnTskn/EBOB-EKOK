import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int num2 = input.nextInt();

        int i = 1;
        int ebob = 1;

        while (i <= num1 && i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int ekok = (num1 * num2) / ebob;

        i = 1;
        System.out.println("Girilen sayıların EBOB'u: " + ebob);

        while (i <= num1 * num2) {
            if (i % num1 == 0 && i % num2 == 0) {
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println("Girilen sayıların EKOK'u: " + ekok);
    }
}
