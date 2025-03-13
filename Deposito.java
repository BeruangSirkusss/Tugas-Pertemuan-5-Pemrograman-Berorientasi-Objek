class Deposito extends Rekening {
    private final int jangkaWaktuBulan;
    private final double sukuBunga;

    public Deposito(String namaPemilik, String nomorRekening, double saldo, int jangkaWaktuBulan, double sukuBunga) {
        super(namaPemilik, nomorRekening, saldo);
        this.jangkaWaktuBulan = jangkaWaktuBulan;
        this.sukuBunga = sukuBunga;
    }

    public double hitungBunga() {
        return saldo * (sukuBunga / 100) * (jangkaWaktuBulan / 12.0);
    }

    @Override
    public void tarik(double jumlah) {
        System.out.println("Penarikan sebelum jatuh tempo, dikenakan denda 10%.");
        saldo -= jumlah + (saldo * 0.1);
    }
}
