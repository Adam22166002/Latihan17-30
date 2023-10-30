package si_regpagi_22166002_latihan27_huruf_besarkecil;
import java.util.Scanner;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan27_Huruf_BesarKecil {
    public static void main(String[] args) {
        System.out.println("========Program Huruf Besar dan Kecil========");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        String uppercase = sentence.toUpperCase();
        String lowercase = sentence.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + uppercase);
        System.out.println("Huruf Kecil : " + lowercase);
        System.out.println("(developed by : ADAM 22166002)");

    }
    
}
