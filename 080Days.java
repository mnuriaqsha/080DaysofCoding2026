import java.util.Scanner;
public class Day80 {
    public static void main (String [] args){
        Scanner hi = new Scanner (System.in);
        
        String [] Goat = {"Anomali","Messi","Pele","CR7","Maradona"};
            
        System.out.print("Masukkan Indeks 1-4: ");
        int indeks =hi.nextInt();
        
        if (indeks >= 0 && indeks < Goat.length){
            System.out.println("Goat no"+indeks+". "+Goat[indeks]);
        } else {
            System.out.println("Pilihan tidak tersedia");
        }
        
        
        }
}
