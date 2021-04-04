package codetaskc;
import java.util.Scanner;

/**
 *
 * @author E41200681_Azizatun Hasanah
 */
public class CodeTaskC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int nilai[];
        int rata_rata, banyak_data;
        int total = 0;
        
        System.out.print("Masukkan Banyaknya Data Nilai : ");
        banyak_data = scan.nextInt();
        nilai = new int[banyak_data];
        
        
        for (int i = 0; i < banyak_data; i++) {
            System.out.print("Masukkan Data Nilai Ke -" + (i + 1) + " = ");
            nilai[i] = scan.nextInt();
            total += nilai[i];
        }
        
        
        int min = nilai[0];
        int max = nilai[0];
        
        for (int j = 0; j < banyak_data; j++) {
            if (nilai[j] < min) {
                min = nilai[j];
                
            }
            }
        
        for (int k = 0; k < banyak_data; k++) {
            if (nilai[k] > max) {
                max = nilai[k];
                
            }
            
        }
        
        rata_rata = total / banyak_data ;
        System.out.println(" ");
        
        
        System.out.println("Nilai Minimum = " + min);
        System.out.println("Nilai Maksimum = " + max);
        System.out.println("Nilai Rata-ratanya adalah = " + rata_rata);
        }      
}
