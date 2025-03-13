import java.util.ArrayList;

public class BankSystem {
    public static void main(String[] args) {
        ArrayList<Rekening> daftarRekening = new ArrayList<>();

        Tabungan tabungan = new Tabungan("Alice", "12345", 1000000, 5);
        Giro giro = new Giro("Bob", "67890", 2000000, 500000);
        Deposito deposito = new Deposito("Charlie", "54321", 5000000, 12, 6);

        daftarRekening.add(tabungan);
        daftarRekening.add(giro);
        daftarRekening.add(deposito);

        tabungan.setor(500000);
        giro.tarik(2600000);
        deposito.tarik(1000000);

        System.out.println("Informasi Semua Rekening:");
        for (Rekening rekening : daftarRekening) {
            rekening.tampilkanInfo();
            System.out.println("---------------------");
        }
    }
}