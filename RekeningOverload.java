class RekeningOverload extends Rekening {
    public RekeningOverload(String namaPemilik, String nomorRekening, double saldo) {
        super(namaPemilik, nomorRekening, saldo);
    }

    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            saldo += jumlah - 2500; 
        } else {
            setor(jumlah);
        }
    }
}
