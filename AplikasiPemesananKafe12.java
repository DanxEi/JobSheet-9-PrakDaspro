import java.util.Scanner;

public class AplikasiPemesananKafe12 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=========================================");
        System.out.println("          DAFTAR MENU KAFE KAMPUS        ");
        System.out.println("=========================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-17s : Rp %,d\n", (i + 1), menu[i], harga[i]);
        }
        System.out.println("=========================================\n");

        System.out.print("Apakah Anda ingin mencari harga menu tertentu? (y/n): ");
        String cariPilihan = input.nextLine();

        if (cariPilihan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan nama makanan/minuman yang dicari: ");
            String kataKunci = input.nextLine();

            int indeksDitemukan = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(kataKunci)) {
                    indeksDitemukan = i;
                    break; 
                }
            }

            if (indeksDitemukan != -1) {
                System.out.println("-> Hasil Cari: Menu '" + menu[indeksDitemukan]
                        + "' DITEMUKAN! Harga: Rp " + harga[indeksDitemukan]);
            } else {
                System.out.println("-> Hasil Cari: Maaf, menu '" + kataKunci + "' TIDAK TERSEDIA.");
            }
            System.out.println();
        }

        System.out.println("--- FITUR PEMESANAN ---");
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = input.nextInt();
        input.nextLine(); 

        String[] pesanan = new String[jumlahItem];
        int[] hargaPesanan = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            boolean valid = false;

            while (!valid) {
                System.out.print("Masukkan nama menu item ke-" + (i + 1) + ": ");
                String namaPesanan = input.nextLine();

                int idx = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        idx = j;
                        break;
                    }
                }

                if (idx != -1) {
                    pesanan[i] = menu[idx];
                    hargaPesanan[i] = harga[idx];
                    totalBiaya += harga[idx];
                    valid = true;
                    System.out.println("   [+] '" + menu[idx] + "' berhasil ditambahkan.");
                } else {
                    System.out.println("   [!] Menu '" + namaPesanan
                            + "' tidak tersedia! Silakan masukkan nama menu sesuai daftar.");
                }
            }
        }

        System.out.println("\n=========================================");
        System.out.println("              NOTA PESANAN KAFE          ");
        System.out.println("=========================================");
        System.out.println("No.  Nama Item               Harga");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d %-22s Rp %,d\n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("-----------------------------------------");
        System.out.printf("TOTAL BIAYA PESANAN : Rp %,d\n", totalBiaya);
        System.out.println("=========================================");
        System.out.println("Terima kasih telah memesan di Kafe Kampus!");

        input.close();
    }
}