public class Lingkaran {
    private double phi = 3.14;
    private int r;

    public double getPhi() {
        return phi;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Lingkaran(int r) {
        this.r = r;
    }
    public double LuasLingkaran(){
        return phi *r*r;
    }
}
