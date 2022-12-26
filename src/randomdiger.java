import java.util.Scanner;

public class randomdiger {
    public void calistir(){
        random random1=new random();
            switch (random1.randoma(3)){
                case 0:
                    milletBahcesi milletBahcesi=new milletBahcesi("Millet Bahçesi");
                    milletBahcesi.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 1:
                    teleferik teleferik=new teleferik("Teleferik");
                    teleferik.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 2:
                    hamamonu hamamonu=new hamamonu("Hamamönü");
                    hamamonu.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
            }
        }
    }

