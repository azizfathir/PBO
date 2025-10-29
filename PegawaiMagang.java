public class PegawaiMagang extends Pegawai{
    private double uangSaku;

    public PegawaiMagang(String nip, String nama, double uangSaku) {
        super(nip, nama);
        this.uangSaku = uangSaku;
    }

    @Override
    public double hitungGaji() {
        return uangSaku;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Status: Pegawai Magang");
        System.out.println("Uang Saku : " + uangSaku);
        System.out.println("Total Gaji: " + hitungGaji());
        System.out.println("----------------------------------");
    }
}
