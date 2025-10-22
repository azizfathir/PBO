import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//
//        Buku Buku1 = new Buku("", "", "", "");
//
//        int menu = 0;
//
//        do {
//            System.out.println("=== MENU Buku ===");
//            System.out.println("1. Tambah Buku");
//            System.out.println("2. Update Status Buku");
//            System.out.println("3. Tampilkan");
//            System.out.println("4. Keluar");
//            System.out.print("Pilih menu: ");
//            menu = input.nextInt();
//            input.nextLine();
//
//            switch(menu) {
//                case 1:
//                    System.out.print("Masukkan Nama Buku: ");
//                String nama = input.nextLine();
//                    System.out.print("Masukkan Penulis Buku : ");
//                String penulis = input.nextLine();
//
//                System.out.print("Masukkan Tahun Terbit Buku : ");
//                String tahun = input.nextLine();
//
//                System.out.print("Masukkan Status Buku : ");
//                String statusBuku = input.nextLine();
//
//                Buku1.setStatusBuku(statusBuku);
//                System.out.println("Status Buku berhasil diubah!\n");
//
//                Buku1 = new Buku(nama, penulis, tahun, statusBuku);
//                break;
//                case 2:
//                System.out.print("Masukkan Status Baru (Tersedia / Tidak): ");
//                String statusBaru = input.nextLine();
//
//                Buku1.setStatusBuku(statusBaru);
//                System.out.println("Status pasien berhasil diubah!\n");
//                break;
//                case 3:
//                Buku1.tampilkanInfo();
//                break;
//
//                default:
//                System.out.println("Terima kasih, sistem klinik ditutup.");
//                break;
//            }
//
//        } while (menu <= 3);

//        Kucing kucing = new Kucing();
//        kucing.setNama("Cepol");
//        kucing.setUsia(2);
//        System.out.println("Nama Kucing: " + kucing.getNama());
//        System.out.println("Usia Kucing: " + kucing.getUsia());
//        System.out.println("=========================================");
//        System.out.println("PROSES PEMBUATAN OBJEK KUCING PERTAMA");
//        System.out.println("=========================================");
//
//        System.out.print("Masukkan Nama Kucing Pertama: ");
//        String nama1 = input.nextLine();
//
//        System.out.print("Masukkan Usia Awal " + nama1 + " (tahun): ");
//        int usia1 = input.nextInt();
//
//        Kucing kucing1 = new Kucing(nama1, usia1);
//
//        input.nextLine(); // Membersihkan buffer setelah nextInt()
//
//        System.out.println("\n=========================================");
//        System.out.println("PROSES PEMBUATAN OBJEK KUCING KEDUA");
//        System.out.println("=========================================");
//
//        System.out.print("Masukkan Nama Kucing Kedua: ");
//        String nama2 = input.nextLine();
//
//        System.out.print("Masukkan Usia Awal " + nama2 + " (tahun): ");
//        int usia2 = input.nextInt();
//
//        Kucing kucing2 = new Kucing(nama2, usia2);
//
//        // PENGGUNAAN GETTER: Mengakses data yang telah diinisialisasi
//        System.out.println("Kucing Pertama: " + kucing1.getNama() + ", Usia: " + kucing1.getUsia() + " tahun.");
//        System.out.println("Kucing Kedua: " + kucing2.getNama() + ", Usia: " + kucing2.getUsia() + " tahun.");
//
//        System.out.print("Masukkan Usia Baru untuk " + kucing1.getNama() + " (Contoh: 4): ");
//        int usiaBaruValid = input.nextInt();
//        System.out.print("Masukkan Usia Baru untuk" + kucing2.getNama() + "(Contoh 4):");
//        int usiaBaru2Valid = input.nextInt();
//
//        kucing1.setUsia(usiaBaruValid); // Setter dengan validasi
//        kucing2.setUsia(usiaBaru2Valid);
//
//        System.out.println("\n--- Hasil Akhir ---");
//        System.out.println("Usia " + kucing1.getNama() + " yang sekarang: " + kucing1.getUsia() + " tahun.");
//        System.out.println("Usia " + kucing2.getNama() + " yang sekarang: " + kucing2.getUsia() + " tahun.");
//        input.close();

        System.out.print("================================\n");
        System.out.println("   PERHITUNGAN LUAS BANGUNAN    ");
        System.out.println("================================");

//      LINGKARAN
        System.out.print("Masukkan jari-jari lingkaran: ");
        int r = input.nextInt();
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.println("Luass Lingkaran: " + lingkaran.LuasLingkaran());

//      PERSEGI
        System.out.print("Masukkan sisi persegi: ");
        int sisi = input.nextInt();
        Persegi persegi= new Persegi(sisi);
        System.out.println("Luas Persegi: " + persegi.LuasPersegi());

//      PERSEGI PANJANG
        System.out.print("Masukkan Panjang Persegi Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang: ");
        int lebar = input.nextInt();
        PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar);
        System.out.print("Luas Persegi Panjang: " + persegipanjang.LuasPP());
    }
}
