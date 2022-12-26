import java.util.Scanner;

public class ankaMall implements Avm{
    private boolean sinema;
    private boolean mağaza;
    private boolean yemek;
    private boolean özgüalan;

    public void ankaMall() {  // CONSTRUCTOR

        Scanner klavye = new Scanner(System.in);
        System.out.println("\n1-Sinema\n" +
                "2-Mağaza\n" +
                "3-Yemek\n" +
                "4-Alışveriş Merkezine Özgü Alan\n");
        System.out.println("AnkaMall alışveriş merkezinde ne yapmak isterisiniz ? ");
        System.out.print("Seçiminiz: ");
        int secim = klavye.nextInt();
        switch (secim){
            case 1:
                this.sinema=true;
                this.mağaza=false;
                this.yemek=false;
                this.özgüalan=false;
                break;
            case 2:
                this.sinema=false;
                this.mağaza=true;
                this.yemek=false;
                this.özgüalan=false;
                break;
            case 3:
                this.sinema=false;
                this.mağaza=false;
                this.yemek=true;
                this.özgüalan=false;
                break;
            case 4:
                this.sinema=false;
                this.mağaza=false;
                this.yemek=false;
                this.özgüalan=true;
                break;
            default:
                break;
        }
    }
    @Override
    public boolean sinema() {
        if(this.sinema==true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("Gidebileceğiniz filmler \n1-Çakallarla Dans 6 ( 50 TL )\n" +
                    "2-Vahşi Gece ( 60 TL )\n" +
                    "3-Barış Akarsu 'MERHABA'  ( 70 TL )\n" +
                    "4-Kendi Yolumda ( 65 TL )\n");
            return true;
        }
        else{
            return false;
        }
    }


    @Override
    public boolean mağaza() {
        if (this.mağaza == true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("\n1-Koton\n" +
                    "2-Mavi\n" +
                    "3-Teknosa\n" +
                    "4-Atasun Optik\n");

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean yemek() {
        if(this.yemek==true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Domino's Pizza\n" +
                    "2-Mc Donald's\n" +
                    "3-Starbucks\n" +
                    "4-Hmbrgr\n");
            System.out.print("Zincir restoranlardan hangisinde yemek yiyeceğinizi seçiniz: ");
            int yemeksecim=klavye.nextInt();
            klavye.nextLine();
            switch (yemeksecim){
                case 1:
                    System.out.println("Domino's Pizzada yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-Margarita + Kola (80 Tl - 90 TL -100 TL)\n" +
                            "2-Sucuksever + Kola (70 TL - 80 TL - 90 Tl)\n" +
                            "3-Süperos + Kola (90 TL - 100 TL - 110 Tl)\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü1=klavye.nextInt();
                    klavye.nextLine();
                    switch (menü1){
                        case 1:
                            int a=0;
                            System.out.println("Margarita menüsünü tercih ettiniz. ");
                            while(a==0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Margarita tercih ettiniz fiyatı 80 TL .");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Margarita tercih ettiniz fiyatı 90 TL .");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Margarita tercih ettiniz fiyatı 100 TL .");
                                    a=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    a=0;
                                }
                            }

                            break;
                        case 2:
                            int b=0;
                            System.out.print("Sucuksever menüsünü tercih ettiniz ");
                            while(b==0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Sucuksever tercih ettiniz fiyatı 70 TL .");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Sucuksever tercih ettiniz fiyatı 80 TL .");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Sucuksever tercih ettiniz fiyatı 90 TL .");
                                    b=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    b=0;
                                }
                            }
                            break;
                        case 3:
                            int c=0;
                            System.out.print("Süperos menüsünü tercih ettiniz ");
                            while(c==0) {
                                System.out.println("\nHangi boyutta pizza tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Süperos tercih ettiniz fiyatı 90 TL .");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Süperos tercih ettiniz fiyatı 100 TL .");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Süperos tercih ettiniz fiyatı 110 TL .");
                                    c=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    c=0;
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Mc Donald's'ta yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-Big Mac Menü ( 80 TL )\n" +
                            "2-Double Cheeseburger Menü ( 65 TL )\n" +
                            "3-Daba Daba Burger Menü ( 70 TL )\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü2=klavye.nextInt();
                    switch (menü2){
                        case 1:
                            System.out.println("Big Mac Menüyü tercih ettiniz fiyatı 80 TL .");
                            break;
                        case 2:
                            System.out.println("Double Cheeseburger Menüyü tercih ettiniz fiyatı 65 TL .");
                            break;
                        case 3:
                            System.out.println("Daba Daba Burger Menüyü tercih ettiniz fiyatı 70 TL .");
                            break;

                    }
                    break;
                case 3:
                    System.out.println("Starbucks'ta bir şeyler içmeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-White Chocolate Mocha (35 TL - 40 TL - 45 TL)\n" +
                            "2-Filtre Kahve (25 TL - 30 TL - 34 TL)\n" +
                            "3-Latte (30 TL - 35 TL - 38 TL )\n" +
                            "4-Çay (15 TL - 20 TL)");
                    System.out.print("Menü seçiminiz: ");
                    int menü3= klavye.nextInt();
                    klavye.nextLine();
                    switch (menü3){
                        case 1:
                            int d=0;
                            System.out.println("White Chocolate Mocha tercih ettiniz.");
                            while(d==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy White Chocolate Mocha tercih ettiniz fiyatı 35 TL .");
                                    d=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy White Chocolate Mocha tercih ettiniz fiyatı 40 TL .");
                                    d=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy White Chocolate Mocha tercih ettiniz fiyatı 45 TL .");
                                    d=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    d=0;
                                }
                            }
                            break;
                        case 2:
                            int f=0;
                            System.out.println("Filtre Kahve tercih ettiniz.");
                            while(f==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Filtre Kahve tercih ettiniz fiyatı 25 TL .");
                                    f=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Filtre Kahve tercih ettiniz fiyatı 30 TL .");
                                    f=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Filtre Kahve tercih ettiniz fiyatı 34 TL .");
                                    f=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    f=0;
                                }
                            }
                            break;
                        case 3:
                            int g=0;
                            System.out.println("Latte tercih ettiniz.");
                            while(g==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Latte tercih ettiniz fiyatı 30 TL .");
                                    g=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Latte tercih ettiniz fiyatı 35 TL .");
                                    g=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Latte tercih ettiniz fiyatı 38 TL .");
                                    g=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    g=0;
                                }
                            }
                            break;
                        case 4:
                            int h=0;
                            System.out.println("Çay tercih ettiniz.");
                            while(h==0) {
                                System.out.println("\nHangi boyutta içecek tercih edersiniz ? ( Küçük Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Çay tercih ettiniz fiyatı 15 TL .");
                                    h=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Çay tercih ettiniz fiyatı 20 TL .");
                                    h=1;
                                }
                                else{
                                    System.out.println("Yanlış bir tuşlama yaptınız boyut seçme ekranına tekrardan yönlendiriliyorsunuz...");
                                    g=0;
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Hmbrgr'de yemek yemeyi tercih ettiniz menü listeleniyor...");
                    System.out.println("1-Tavuk Fileto Burger Menü ( 75 TL )\n" +
                            "2-Cheeseburger Menü ( 80 TL )\n" +
                            "3-Keçi Peynirli & Ananaslı Baba Burger Menü ( 99 TL )\n");
                    System.out.print("Menü seçiminiz: ");
                    int menü4= klavye.nextInt();
                    switch (menü4){
                        case 1:
                            System.out.println("Tavuk Fileto Burger Menü tercih ettiniz fiyatı 75 TL .");
                            break;
                        case 2:
                            System.out.println("Cheeseburger Menü tercih ettiniz fiyatı 80 TL .");
                            break;
                        case 3:
                            System.out.println("Keçi Peynirli & Ananaslı Baba Burger Menü tercih ettiniz fiyatı 99 TL .");
                            break;
                    }
                    break;

            }
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean özgüalan() {
        Scanner klavye=new Scanner(System.in);
        if(this.özgüalan==true){
            System.out.println("\nAnkaMall alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan alanı özel eğlence oyun merkezidir ");
            int maaliyet=0;
            System.out.println("Kaç adet oyuncak aleti kullanmak istiyorsunuz ? ( Alet başı ücretlendirme 10 TL'dir )");
            System.out.print("Adet: ");
            int adet= klavye.nextInt();
            maaliyet+=(10*adet);
            System.out.println("Maaliyetinize "+maaliyet+" TL eklenecektir.");
            return true;
        }
        else{
            return false;
        }
    }
}

