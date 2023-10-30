package si_regpagi_22166002_latihan30_cakep;
import java.util.Scanner;
/**
 * @author 
 * Nama:ADAM
 * Nim:22166002
 * SISTEM INFORMASI
 * PEMOGRAMAN BERBASIS WEB
 */
public class SI_RegPagi_22166002_Latihan30_Cakep {
    public static void main(String[] args) {
        System.out.println("\u001b[34m========Program Akhir Lahitan========");
        Scanner scanner = new Scanner (System.in);
        System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
        System.out.print("\u001b[34mJawab \u001b[31m(Yoi/Enggak) \u001b[0m: ");
        String jawab = scanner.next();
        
        if (jawab.equals("Yoi")) {
            System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
            System.out.println("\u001b[32mdeveloped by : ADAM 22166002");
        }else {
            System.out.println("""
                               \n\u001b[31mTetep cakep sih.
                               \u001b[36mSing penting paham konsep nya yee.\u001b[0m""");
            System.out.println("Keep the code works dude");
            System.out.println("\u001b[32mdeveloped by : ADAM 22166002");
        }
    }
    
}
