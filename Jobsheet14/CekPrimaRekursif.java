import java.util.Scanner;

public class CekPrimaRekursif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan: ");
        int n = scanner.nextInt();

        if (cekPrimaRekursif(n)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    // Fungsi rekursif untuk mengecek apakah suatu bilangan adalah bilangan prima atau bukan
    public static boolean cekPrimaRekursif(int n) {
        return (n > 1) && cekPrimaRekursifHelper(n, n / 2);
    }

    private static boolean cekPrimaRekursifHelper(int n, int i) {
        if (i == 1) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return cekPrimaRekursifHelper(n, i - 1);
    }
}
