import java.util.Scanner;

public class digerCalistir {

    public void calistir(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("\n***** FARKLI ETKİNLİK ÖNERİLERİ EKRANINA HOŞGELDİNİZ *****\n");
        int a=0;
        while (a==0){
            System.out.println(
                    "1-Millet Bahçesi\n" +
                            "2-Teleferik\n" +
                            "3-Hamamönü\n");
            System.out.println("Size önerdiğimiz etkinliklerden hangisini yapmak istersiniz ?");
            System.out.print("Cevabınız: ");
            int secim= klavye.nextInt();
            switch (secim){
                default:
                    System.out.println("Yanlış bir tuşlama yaptınız seçim ekranına tekrardan yönlendiriliyorsunuz.");
                    a=0;
                case 1:
                    diger milletBahcesi=new milletBahcesi("Millet Bahçesi");
                    milletBahcesi.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
                case 2:
                    diger teleferik=new teleferik("Teleferik");
                    teleferik.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
                case 3:
                    diger hamamonu=new hamamonu("Hamamönü");
                    hamamonu.bilgileri_goster();
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    a=1;
                    break;
            }
        }
    }
}

