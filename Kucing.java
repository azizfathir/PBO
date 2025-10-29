public class Kucing extends Hewan{
    public Kucing(String jenis, int kaki) {
        super(jenis, kaki);
    }

    @Override
    public void makanan() {
        super.makanan();
        System.out.println("Makanan: Makan Whiskas");
    }

    @Override
    public void Bersuara() {
        super.Bersuara();
        System.out.println("Miawwwwwwwww");
    }
}

