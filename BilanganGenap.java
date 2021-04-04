package bilangangenap;
import java.util.Scanner;

/**
 *
 * @author E41200681_Azizatu Hasanah
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int awal, akhir;
        
        System.out.print("Masukkan Nilai Awal : ");
        awal = scan.nextInt();
        
        System.out.print("Masukkan Nilai Akhir : ");
        akhir = scan.nextInt();
        
        System.out.print("Deret Bilangan Genap : ");
        for (int x = awal; x <= akhir; x++){
            if (x % 2 == 0){
                System.out.print(x + " ");
            }
        }
    }   
}
