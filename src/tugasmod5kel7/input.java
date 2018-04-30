package tugasmod5kel7;

import java.util.Scanner;

public class input {
    Scanner sc = new Scanner(System.in);
    float sisi,volume;
    rumus kubus;
    
    public input(){
        kubus = new rumus();
        System.out.println("Masukkan panjang sisi: " );
        sisi = sc.nextInt();       
        kubus.sisi = this.sisi;
        volume = 1 *kubus.rumus();
    }
    
    public void volumekubus() {
        System.out.println("Volume kubus adalah = " +volume);   
    }
}
