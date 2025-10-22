public class Persegi {
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public double LuasPersegi(){
        return sisi*sisi;
    }
}
