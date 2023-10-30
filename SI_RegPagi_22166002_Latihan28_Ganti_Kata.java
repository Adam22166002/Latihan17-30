package si_regpagi_22166002_latihan28_ganti_kata;

import java.util.Scanner;

public class SI_RegPagi_22166002_Latihan28_Ganti_Kata {

    public static void main(String[] args) {
        System.out.println("========Program Mengganti Kata========");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String sentence = input.nextLine();

        System.out.print("Ganti Kata: ");
        String oldWord = input.next();

        System.out.print("Menjadi Kata: ");
        String newWord = input.next();

        String newSentence = sentence.replaceAll(oldWord, newWord);

        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal: " + sentence);
        System.out.println("Kalimat baru: " + newSentence);
        System.out.println("(developed by : ADAM 22166002)");

    }
    
}
