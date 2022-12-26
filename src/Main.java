import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n\t***** ANKARA GEZİ REHBERİ PROGRAMINA HOŞGELDİNİZ *****");
        System.out.println("**************************************************************\n");
        for(int j=0;j<999;j++){
            System.out.println(" Kendiniz seçmek istiyorsanız 1'i tuşlayınız\n Uygulamamızın sizin için seçmesini istiyorsanız 2'yi tuşlayınız.");
            System.out.print(" Seçiminiz: ");
            Scanner klavye = new Scanner(System.in);
            int secim= klavye.nextInt();
            System.out.println("\n");
            if(secim==1)
            {
                for (int k=0;k<99;k++){
                    System.out.println("\n*****************KULLANICI SEÇSİN EKRANINA HOŞGELDİNİZ****************");
                    System.out.println("Lütfen sizin için hazırladığımız seçeneklerden birini seçiniz");
                    System.out.println(" 1-Avm\n 2-Müze\n 3-Park\n 4-Diğer");
                    System.out.print("Seçiminiz:");
                    int menu = klavye.nextInt();
                    switch (menu) {
                        case 1:
                            Avmcalistir avm = new Avmcalistir();
                            avm.calistir();
                            k = 100;
                            break;
                        case 2:
                            müze mymüze = new müze();
                            mymüze.secenek();
                            k = 100;
                            break;
                        case 3:
                            park mypark = new park();
                            mypark.secenek();
                            k=100;
                            break;
                        case 4:
                            digerCalistir digerCalistir = new digerCalistir();
                            digerCalistir.calistir();
                            k=100;
                            break;
                        default:
                            System.out.println("Hatalı tuşlama yaptınız");
                            System.out.println("lütfen doğru seçim yapınız");
                            System.out.println("****************************************");
                            k=0;
                            break;

                    }}
            }
            else if (secim==2) {
                random random1 = new random();
                switch (random1.randoma(4)) {
                    case 0:
                        randomavm randomavm1=new randomavm();
                        randomavm1.calistir();
                        break;
                    case 1:
                        randommuze randommuze1=new randommuze();
                        randommuze1.secenek();
                        break;
                    case 2:
                        randompark randompark1=new randompark();
                        randompark1.secenek();
                        break;
                    case 3:
                        randomdiger randomdiger1=new randomdiger();
                        randomdiger1.calistir();

                        break;
                }

            }
            for (int e=0;e<99;e++) {
                System.out.println("\nAna menüye dönmek için 1 uygulamayı sonlandırmak için 2 yi tuşlayınız");
                System.out.print("Cevabınız:");
                int menu = klavye.nextInt();
                if (menu == 1) {
                    System.out.println("Ana menüye yönlendiriliyorsunuz");
                    System.out.println("*********************************************************\n");
                    j = 0;
                    e=100;
                } else if (menu == 2) {
                    System.out.println("Size daha iyi bir hizmet için anket sayfamıza yönlendiriliyorsunuz....");
                    System.out.println("*********************************************************\n");
                    j = 1000;
                    e=100;
                } else {
                    System.out.println("Hatalı tuşlama yaptınız");
                    e=0;
                }
            }

        }
            System.out.println("Değerlendirme anketine katılmak için 1'i tuşlayınız yoksa 2'yi tuşlayınız.");
            System.out.print("Cevabınız:");
            Scanner scanner=new Scanner(System.in);
            int anket= scanner.nextInt();
            scanner.nextLine();
             if (anket==1){
                System.out.print("İsminiz:");
                String isim= scanner.nextLine();
                System.out.print("Soyisminiz:");
                String soyisim= scanner.nextLine();
                System.out.println("Değerlendirmek için 1 ile 10 arasında puan giriniz.(  1-Çok Kötü   10-Çok iyi   )");
                 System.out.print("Cevabınız:");
                int puan= scanner.nextInt();
                anket myanket= new anket();
                myanket.setPuan(puan);
                myanket.setIsim(isim);
                myanket.setSoyisim(soyisim);
                System.out.print("İsim Soyisim:" +myanket.getIsim()+" "+myanket.getSoyisim());
                System.out.println("\nVerdiğiniz puan:" +myanket.getPuan());

            } else if(anket==2) {
                System.out.println("***********UYGULAMA SONLANDIRLIYOR*****************");
            }
             else{
                 System.out.println("Yanlış bir tuşlama yaptınız uygulama sonlandırılıyor...");
             }
        }



    }
