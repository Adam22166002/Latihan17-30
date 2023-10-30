package si_regpagi_22166002_latihan22_perhitungan_lingkaran;
import java.util.Scanner;
/**
 * @author 
 * NAMA:ADAM
 * NIM:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan22_Perhitungan_lingkaran {
public static void main(String[] args) {
    System.out.println("========Program Perhitungan Lingkaran========");
        Scanner input = new Scanner(System.in);
        
        double diameter = 0;
        boolean validInput = false;

        do {
            System.out.println("Masukkan Diameter lingkaran = ");
            if (input.hasNextDouble()) {
                diameter = input.nextDouble();
                if (diameter > 0) {
                    validInput = true;
                } else {
                    System.out.println("Nilai Diameter tidak sesuai. Diameter harus lebih besar dari 0.");
                }
            } else {
                System.out.println("Nilai Diameter tidak sesuai. Harap masukkan angka yang valid.");
                input.next();
            }
        } while (!validInput);

        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = Math.PI * diameter;

        System.out.println("Jari-Jari Lingkaran: " + jariJari);
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
        
        System.out.println("======(developed by : ADAM 22166002)==========");
        input.close();
    }
    
}
