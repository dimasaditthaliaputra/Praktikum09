import java.util.Scanner;

public class TugasArray206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalBiaya = 0;

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        int[] hargaPesanan = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = sc.nextInt();
            sc.nextLine();

            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nDaftar Pesanan:");
        System.out.printf("%-20s %s%n", "Nama Pesanan", "Harga");
        System.out.println("-------------------------------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s Rp %d%n", namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("%-20s Rp %.1f%n", "Total Biaya:", totalBiaya);
    }
}
