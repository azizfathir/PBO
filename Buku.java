public class Buku {
    private String nama;
    private String penulis;
    private String tahun;
    private String statusBuku;

    public  Buku(String nama, String penulis, String tahun, String statusBuku) {
        this.nama = nama;
        this.penulis = penulis;
        this.tahun = tahun;
        this.statusBuku = statusBuku;
    }

    public void setStatusBuku(String statusBuku) {
        this.statusBuku = statusBuku;
    }

    public void tampilkanInfo() {
        System.out.println("\n=== Informasi Buku ===");
        System.out.println("Nama     : " + nama);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun : " + tahun);
        System.out.println("Status   : " + statusBuku + "\n");
    }
}
