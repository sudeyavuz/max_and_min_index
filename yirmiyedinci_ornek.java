package JAVA101;
import java.util.Scanner;
public class yirmiyedinci_ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz?");
        int sayi= input.nextInt();
        int enb =Integer.MIN_VALUE;
        int enk=Integer.MAX_VALUE;
        for (int i =1;i<= sayi;i++){
            System.out.println(i+". sayıyı giriniz: ");
            int mevcutsayi = input.nextInt();
            if (mevcutsayi>enb){
                enb = mevcutsayi;
            }
            if (mevcutsayi<enk){
                enk = mevcutsayi;
            }
        }
        System.out.println("en büyük sayı: "+enb);
        System.out.println("en küçük sayı: "+enk);
    }

}
