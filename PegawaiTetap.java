public class PegawaiTetap extends Pegawai{
    private double gajiPokok;
    private double tunjangan;

    public PegawaiTetap(String nip, String nama, double gajiPokok, double tunjangan) {
        super(nip, nama);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Status: Pegawai Tetap");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Total Gaji : " + hitungGaji());
        System.out.println("----------------------------------");
    }
}
