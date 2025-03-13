class Rekening {
    protected String namaPemilik;
    protected String nomorRekening;
    protected double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
    }

    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }
}