public class Pegawai {
        protected String nip;
        protected String nama;

        public Pegawai(String nip, String nama) {
            this.nip = nip;
            this.nama = nama;
        }

        // Method default
        public double hitungGaji() {
            return 0;
        }

        public void info() {
            System.out.println("NIP   : " + nip);
            System.out.println("Nama  : " + nama);
        }
    }
