import java.util.Scanner;
public class MainPangkat07 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat07[] pangkat = new Pangkat07[elemen];
        for(int i= 0; i<elemen;i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat1 = input.nextInt();
            pangkat[i] = new Pangkat07();
            pangkat[i].pangkat(basis, pangkat1);
        }

        System.out.println("\nHASIL PANGKAT BRUTEFORCE: ");
        for(Pangkat07 p : pangkat){
            System.out.println(p.nilai+"^"+p.pangkat+" : " + p.pangkatBF(p.nilai, p.pangkat));
        }

        System.out.println("\nHASIL PANGKAT DIVIDE AND CONQUER: ");
        for(Pangkat07 p : pangkat){
            System.out.println(p.nilai+"^"+p.pangkat+" : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}