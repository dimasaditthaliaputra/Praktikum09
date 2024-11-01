import java.util.Scanner;

public class TugasArray106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int tertinggi = 0, terendah = 100;

        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput: ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            } else if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rataRata = (double) total / jumlahMhs;

        System.out.println("\n=============================");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai dari mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }
        System.out.println("=============================");

        System.out.println("\n---------------------");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("---------------------");
    }
}
