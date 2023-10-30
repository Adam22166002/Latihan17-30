package si_regpagi_22166002_latihan17_tunjangan;
import java.util.Scanner;
/**
 * @author
 * NAMA: ADAM
 * NIM: 22166002
 * PRODI: SISTEM INFORMASI
 * MATAKULIAH: PBO
 */
public class SI_RegPagi_22166002_Latihan17_Tunjangan {
    public static void main(String[] args) {
        System.out.println("\n=====Program Tunjangan=====");
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa Gaji Anda per bulan: Rp ");
        double gajiPokok = input.nextDouble();

        System.out.println("Status Anda? (Menikah/Belum? : ");
        String statusPerkawinan = input.next();
        // Menghitung tunjangan Menikah
        double tunjangan;
        if (statusPerkawinan.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        // Menampilkan hasil
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + tunjangan);
        System.out.println("Total Gaji : Rp " + totalGaji);
        System.out.println(" (developed by : ADAM 22166002)");
    }
}
