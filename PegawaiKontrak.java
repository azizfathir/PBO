public class PegawaiKontrak extends Pegawai{
    private double upahHarian;
    private int hariKerja;

    public PegawaiKontrak(String nip, String nama, double upahHarian, int hariKerja) {
        super(nip, nama);
        this.upahHarian = upahHarian;
        this.hariKerja = hariKerja;
    }

    @Override
    public double hitungGaji() {
        return upahHarian * hariKerja;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Status: Pegawai Kontrak");
        System.out.println("Upah Harian : " + upahHarian);
        System.out.println("Hari Kerja  : " + hariKerja);
        System.out.println("Total Gaji  : " + hitungGaji());
        System.out.println("----------------------------------");
    }
}
