package si_regpagi_22166002_latihan26_waktu_saat_ini;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan26_Waktu_Saat_ini {
    public static void main(String[] args) {
        System.out.println("========Program Waktu Saat Ini========");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");

        String formattedTime = now.format(formatter);
        System.out.println("Hari ini adalah hari " + formattedTime);
        System.out.println("(developed by : ADAM 22166002)");
    }
}