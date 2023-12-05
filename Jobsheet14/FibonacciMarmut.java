import java.util.Scanner;

public class FibonacciMarmut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bulan ke berapa: ");
        int bulan = scanner.nextInt();

        int jumlahPasangan = hitungPasanganMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);
    }

    // Fungsi rekursif untuk menghitung jumlah pasangan marmut pada suatu bulan
    public static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 2) + hitungPasanganMarmut(bulan - 1);
        }
    }
}
