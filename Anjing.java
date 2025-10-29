public class Anjing extends Hewan {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void makanan() {
        super.makanan();
        System.out.println("Makanan: Minum Susu");
    }
}
