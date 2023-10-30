package si_regpagi_22166002_latihan24_perbandingan2buah_nilai;
import java.util.Scanner;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan24_Perbandingan2buah_nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String repeat;
        do {
            System.out.println("========Program Perbandingan Nilai========");
            System.out.print("Masukkan nilai pertama: ");
            int value1 = input.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int value2 = input.nextInt();

            if (value1 > value2) {
                System.out.println("Hasil " + value1 + " Lebih besar dari " + value2);
            } else if (value1 < value2) {
                System.out.println("Hasil " + value1 + " Lebih kecil dari " + value2);
            } else {
                System.out.println("Hasil " + value1 + " Sama dengan " + value2);
            }
            
            System.out.print("Ulangi Aktifitas? (Ya/Tidak) : ");
            repeat = input.next();
        } while (repeat.equalsIgnoreCase("Ya"));
        System.out.println(" (developed by : ADAM 22166002)");
    }
}
