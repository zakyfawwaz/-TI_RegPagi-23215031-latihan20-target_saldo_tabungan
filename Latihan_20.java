public class Latihan_20 {
    public static void main(String[] args) {
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double saldoTarget = 6000000;
        int bulan = 0;

        System.out.println("Saldo Awal: Rp " + saldoAwal);
        System.out.println("Target Saldo: Rp " + saldoTarget);

        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * bunga;
            bulan++;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldoAwal);
        }

        System.out.printf("Diperlukan waktu %d bulan untuk mencapai saldo Rp.%,.0f%n", bulan, saldoTarget);
    }
}