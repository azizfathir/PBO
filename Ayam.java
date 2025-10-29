public class Ayam extends Hewan {
    public Ayam(String jenis, int kaki) {
        super(jenis, kaki);
    }

    @Override
    public void Bersuara() {
        super.Bersuara();
        System.out.println("Kukuruyuk");
    }
}
