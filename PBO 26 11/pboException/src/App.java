import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    try {
        // Input data dari user
        System.out.print("Masukkan No Struk: ");
        int noFaktur = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Masukkan Jumlah Beli: ");
        int jumlahBeli = scanner.nextInt();
        // Membuat objek Transaksi 
        //polimorphisme
        Barang transaksi = new Transaksi(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);
        // Menampilkan informasi transaksi
        //melakukunya downcasting dari parent ke child
        //tujuannya  agar dapat menggunakan method dari kelas child
        ((Transaksi) transaksi).tampilkanTransaksi(); // Polimorphism

    } catch (Exception e) {
        System.out.println("Terjadi kesalahan: " + e.getMessage());
    } finally {
        scanner.close();
    }
    }
}