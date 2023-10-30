package si_regpagi_22166002_latihan23_nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan23_nilaiterbesardanterkecil {
    public static void main(String[] args) {
        System.out.println("========Program Nilai Terbesar Terkecil========");
        Scanner input = new Scanner(System.in);

        System.out.println("-----Program Nilai Terbesar dan Terkecil Nilai Mahasiswa-----");
        System.out.print("Masukkan Nama Petugas : ");
        String name = input.nextLine();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int n = input.nextInt();

        int[] nilai = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("-----Hasil Nilai Mahasiswa-----");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i+1) + " = " + nilai[i]);
        }
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("Nama Petugas " + name);
    }
}
