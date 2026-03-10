
import java.util.Scanner;

public class MainNilaiMahasiswa07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        int uts[] = new int[n];
        int uas[] = new int[n];

        for(int i = 0; i < n; i++){

            System.out.print("Nilai UTS mahasiswa ke-" + (i+1) + " : ");
            uts[i] = sc.nextInt();

            System.out.print("Nilai UAS mahasiswa ke-" + (i+1) + " : ");
            uas[i] = sc.nextInt();
        }

        NilaiMahasiswa07 nm = new NilaiMahasiswa07(uts, uas);

        System.out.println("\nNilai UTS Tertinggi : " + nm.maxUTS(0, n-1));
        System.out.println("Nilai UTS Terendah : " + nm.minUTS(0, n-1));
        System.out.println("Rata-rata Nilai UAS : " + nm.rataUAS());

    }
}