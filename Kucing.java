public class Kucing {
    private String nama;
    private int usia;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

//    Constructor
    public Kucing(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
}
