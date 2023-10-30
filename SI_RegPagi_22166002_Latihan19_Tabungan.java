package si_regpagi_22166002_latihan19_tabungan;
/**
 * @author
 * NAMA: ADAM
 * NIM: 22166002
 * PRODI: SISTEM INFORMASI
 * MATAKULIAH: PBO
 */
public class SI_RegPagi_22166002_Latihan19_Tabungan {
    public static void main(String[] args) {
        System.out.println("========Program Tabungan========");
        //saldo awal
        int saldoAwal = 2500000;
        // Bunga per bulan dalam persen
        double bungaPerBulan = 15.0;
        // Lama bulan
        int lamaBulan = 6;

        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        System.out.println("Bunga/Bulan(%): " + bungaPerBulan);
        System.out.println("Lama (bulan): " + lamaBulan);
        

        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = ((bungaPerBulan / 100.0) * saldoAwal);
            saldoAwal += bunga;
            System.out.println("Saldo bulan " + bulan + ": Rp. " + saldoAwal);
            
    }
        System.out.println(" (developed by : ADAM 22166002)");
}
}