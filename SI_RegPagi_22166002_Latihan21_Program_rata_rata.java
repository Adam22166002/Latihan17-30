package si_regpagi_22166002_latihan21_program_rata_rata;
import java.util.Scanner;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan21_Program_rata_rata {
    public static void main(String[] args) {
        System.out.println("========Program Rata-Rata Nilai Mahasiswa========");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nilai[i];
        }

        double average = (double) sum / n;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + average);

    }
    
}
