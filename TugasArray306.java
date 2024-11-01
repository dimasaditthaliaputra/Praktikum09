import java.util.Scanner;

public class TugasArray306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String searchMenu = sc.nextLine();

        boolean ditemukan = false;

        for (String makanan : menu) {
            if (makanan.equalsIgnoreCase(searchMenu)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println(searchMenu + " tersedia di menu.");
        } else {
            System.out.println(searchMenu + " tidak tersedia di menu.");
        }
    }
}
