import java.util.Scanner;
public class ArrayNilai12 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int lulus = 0, tidakLulus = 0;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status;
            if (nilaiAkhir[i] > 70) { status = "LULUS"; lulus++; }
            else { status = "TIDAK LULUS"; tidakLulus++; }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            }
            System.out.println("Jumlah lulus: " + lulus);
            System.out.println("Jumlah tidak lulus: " + tidakLulus);
    }
}