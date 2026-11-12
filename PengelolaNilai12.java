import java.util.Scanner;

public class PengelolaNilai12 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        int total = 0;

        System.out.println("\n--- Input Nilai Mahasiswa ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i]; 
        }

        double rataRata = (double) total / n;

        int max = nilai[0];
        int min = nilai[0];
        for (int i = 1; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        int batasLulus = 65;

        System.out.println("\n=================================");
        System.out.println("       REKAP NILAI MAHASISWA     ");
        System.out.println("=================================");
        System.out.println("Daftar Nilai dan Status:");
        for (int i = 0; i < n; i++) {
            String status = (nilai[i] >= batasLulus) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i] + " (" + status + ")");
        }
        System.out.println("---------------------------------");
        System.out.printf("Nilai Rata-rata : %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi : " + max);
        System.out.println("Nilai Terendah  : " + min);
        System.out.println("=================================");

        sc.close();
    }
}