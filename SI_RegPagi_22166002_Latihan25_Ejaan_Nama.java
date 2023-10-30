package si_regpagi_22166002_latihan25_ejaan_nama;
import java.util.Scanner;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan25_Ejaan_Nama {
    public static void main(String[] args) {
        System.out.println("========Program Ejaan Nama Anda========");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String name = input.nextLine();

        System.out.println("Ejaan untuk \"" + name + "\" adalah :");
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + ": " + name.charAt(i));
            
        }
        System.out.println(" (developed by : ADAM 22166002)");
    }
}
