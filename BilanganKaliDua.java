package bilangankalidua;

/**
 *
 * @author E41200681_Azizatun Hasanah
 */
public class BilanganKaliDua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int hasil = 0;
        int angka = 1;
        
        System.out.println("Bilangan perkalian 2 ( 0 - 100 )");
        System.out.println("================================");
        
        do {
            hasil = angka * 2;
            if(hasil < 100){
                System.out.print(hasil + " ");
            }
            angka = hasil;
        } while(angka < 100);
    }
}
    
    

