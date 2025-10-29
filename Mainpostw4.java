import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            boolean loop = true;

            do {
                System.out.println("=== PROGRAM HEWAN ===");
                System.out.println("1. Kucing");
                System.out.println("2. Anjing");
                System.out.println("3. Keluar");
                System.out.print("Masukan pilihan : ");
                int pilih = input.nextInt();


                switch (pilih) {
                    case 1:
                        input.nextLine();
                        System.out.print("Masukan Nama : ");
                        String nama = input.nextLine();
                        System.out.print("Masukan Umur : ");
                        int umur = input.nextInt();

                        Kucing kucing = new Kucing(nama, umur);
                        System.out.println(" === Info Hewan === ");
                        System.out.println("Nama : " + nama);
                        System.out.println("Umur: " + umur);
                        kucing.makanan();
                        break;
                    case 2:
                        input.nextLine();
                        System.out.print("Masukan Nama : ");
                        String namaAnjing = input.nextLine();
                        System.out.print("Masukan Umur : ");
                        int umurAnjing = input.nextInt();

                        Anjing anjing = new Anjing(namaAnjing, umurAnjing);
                        System.out.println(" === Info Hewan === ");
                        System.out.println("Nama : " + namaAnjing);
                        System.out.println("Umur: " + umurAnjing);
                        anjing.makanan();
                        break;
                    case 3:
                        loop = false;
                        System.out.println("Program Berhenti");
                        break;
                    default:
                        System.out.println("inputan yang anda masukan tidak sesuai");
                        break;
                }
            } while (loop);
        }
    }





