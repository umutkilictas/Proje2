import java.util.Scanner;

public class armada implements Avm{
    private boolean sinema;
    private boolean mağaza;
    private boolean yemek;
    private boolean özgüalan;
    public armada() {  // CONSTRUCTOR

        Scanner klavye = new Scanner(System.in);
        System.out.println("\n1-Sinema\n" +
                "2-Mağaza\n" +
                "3-Yemek\n" +
                "4-Alışveriş Merkezine Özgü Alan\n");
        System.out.println("Armada alışveriş merkezinde ne yapmak isterisiniz ? ");
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
            System.out.println("\n1-Müjdemi İsterim ( 50 TL )\n" +
                    "2-Panda ve Sevimli Canavarlar ( 60 TL )\n" +
                    "3-Black Panther : Yaşasın Wakanda  ( 70 TL )\n" +
                    "4-Black Adam ( 65 TL )\n");
            System.out.print("Lütfen hangi filmi izlemek istediğinizi seçiniz: ");
            int filmsecim= klavye.nextInt();
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
            System.out.println("\n1-D&R\n" +
                    "2-5M Migros\n" +
                    "3-Adidas\n" +
                    "4-Swatch\n");
            return true;
        } else {
            return false;
        }
    }
    @Override
    public boolean özgüalan() {
        if(this.özgüalan==true){
            Scanner klavye=new Scanner(System.in);
            int maaliyet=0;
            System.out.println("\nArmada alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan alanı özel eğlence oyun merkezidir " +
                    "girişi ücretsizdir.Ayrıca IF Armada konspetinde açık hava konserleri verilmektedir.Sizin tercihiniz hangisidir ?");
            System.out.println("1-Eğlence Oyun Merkezi\n" +
                    "2-IF Armada Açık Hava Konserleri\n");
            System.out.print("Tercihiniz: ");
            int armadatercih= klavye.nextInt();
            switch (armadatercih){
                case 1:
                    System.out.println("Eğlence Oyun Merkezini tercih ettiniz.");
                    System.out.println("1-Bowling\n" +
                            "2-Korku Labirenti\n" +
                            "3-Eğlence Oyuncakları\n");
                    System.out.println("Yukarıdaki eğlence seçeneklerinden hangisini tercih edersiniz ?");
                    System.out.print("Tercihiniz: ");
                    int tercih= klavye.nextInt();
                    switch (tercih){
                        case 1:
                            System.out.println("Bowling oynamayı tercih ettiniz.Giriş ücreti 50 TL'dir.");
                            break;
                        case 2:
                            System.out.println("Korku Labirenti'ne girmeyi tercih ettiniz.Giriş ücreti 70 TL'dir.");
                            break;
                        case 3:
                            System.out.print("Eğlence Oyuncaklarında zaman geçirmeyi tercih ettiniz maaliyetlendirme kaç adet oyuncak aleti kullanacağınıza göre yapılacaktır...");
                            System.out.println("( Alet başı ücretlendirme 10 TL'dir )");
                            break;
                    }
                case 2:
                    System.out.println("IF Armada Açık Hava Konserlerini tercih ettiniz.");
                    System.out.println("IF Armada Açık Hava Konserlerini'nin girişi 150 TL'dir.");

            }
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean yemek() {
        if(this.yemek==true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Domino's Pizza\n" +
                    "2-Arby's\n" +
                    "3-Starbucks\n" +
                    "4-HD İskender\n");
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
                                    System.out.println("Küçük boy Margarita tercih ettiniz fiyatı 80 Tl.");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Margarita tercih ettiniz fiyatı 90Tl");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Margarita tercih ettiniz fiyatı 100 TL ");
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
                                    System.out.println("Küçük boy Sucuksever tercih ettiniz fiyatı 70 Tl.");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Sucuksever tercih ettiniz fiyatı 80 TL .");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Sucuksever tercih ettiniz fiyatı 90 Tl");
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
                                    System.out.println("Küçük boy Süperos tercih ettiniz fiyatı 90 TL");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Süperos tercih ettiniz fiyatı 100 TL.");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Süperos tercih ettiniz fiyatı 100 TL");
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
                    System.out.println("Arby's'te yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-Barbekü Deluxe XL Menü ( 85 TL )\n" +
                            "2-Biftek Philly Brioche Menü ( 83 TL )\n" +
                            "3-BBQ Gurme Tavuk Menü ( 73 TL )\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü2=klavye.nextInt();
                    switch (menü2){
                        case 1:
                            System.out.println("Barbekü Deluxe XL Menüyü tercih ettiniz fiyatı 85 TL.");
                            break;
                        case 2:
                            System.out.println("Biftek Philly Brioche Menüyü tercih ettiniz fiyatı 83 TL.");
                            break;
                        case 3:
                            System.out.println("BBQ Gurme Tavuk Menüyü tercih ettiniz fiyatı 73 TL.");
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
                                    System.out.println("Küçük boy White Chocolate Mocha tercih ettiniz fiyatı 35 TL.");
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
                                    System.out.println("Küçük boy Filtre Kahve tercih ettiniz fiyati 25 TL .");
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
                                    System.out.println("Orta boy Latte tercih ettiniz fiyatı 35 TL.");
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
                            System.out.println("Çay tercih ettiniz.");
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
                    System.out.println("HD İskender'de yemek yemeyi tercih ettiniz menü listeleniyor...");
                    System.out.println("1-İskender 1 Porsiyon  ( 60 TL )\n" +
                            "2-İskender 1,5 Porsiyon  ( 75 TL )\n" +
                            "3-İskender Duble Porsiyon ( 100 TL )\n");
                    System.out.print("Menü seçiminiz: ");
                    int menü4= klavye.nextInt();
                    klavye.nextLine();
                    switch (menü4){
                        case 1:
                            int a=0;
                            System.out.println("İskender 1 Porsiyon tercih ettiniz .");
                            while(a==0) {
                                System.out.println("İçecek istiyor musunuz ? ( Evet ya da Hayır )");
                                System.out.print("Cevabınız: ");
                                String icecek = klavye.nextLine();
                                if (icecek.equalsIgnoreCase("evet")) {
                                    System.out.println("Hangi içecekten istiyorsunuz ? \n1-Coca Cola ( 15 TL)\n" +
                                            "2-Sprite ( 15 TL )\n" +
                                            "3-Fanta ( 15 TL )\n" +
                                            "4-Ayran ( 10 TL )\n");
                                    System.out.print("Tercihiniz: ");
                                    int icecek2 = klavye.nextInt();
                                    switch (icecek2) {
                                        case 1:
                                            System.out.println("1 porsiyon iskender ve coca cola tercih ettiniz fiyatı 75 TL .");
                                            a=1;
                                            break;
                                        case 2:
                                            System.out.println("1 porsiyon iskender ve sprite tercih ettiniz fiyatı 75 TL .");
                                            a=1;
                                            break;
                                        case 3:
                                            System.out.println("1 porsiyon iskender ve fanta tercih ettiniz fiyatı 75 TL .");
                                            a=1;
                                            break;
                                        case 4:
                                            System.out.println("1 porsiyon iskender ve ayran tercih ettiniz fiyatı 70 TL .");
                                            a=1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("1 porsiyon iskenderin yanına içecek tercih etmediniz maaliyetinize 60 TL eklenecektir.");
                                    a=1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    a=0;
                                }
                            }
                            break;
                        case 2:
                            int b=0;
                            System.out.println("İskender 1,5 Porsiyon tercih ettiniz.");
                            while(b==0) {
                                System.out.println("İçecek istiyor musunuz ? ( Evet ya da Hayır )");
                                System.out.print("Cevabınız: ");
                                String icecek = klavye.nextLine();
                                if (icecek.equalsIgnoreCase("evet")) {
                                    System.out.println("Hangi içecekten istiyorsunuz ? \n1-Coca Cola ( 15 TL)\n" +
                                            "2-Sprite ( 15 TL )\n" +
                                            "3-Fanta ( 15 TL )\n" +
                                            "4-Ayran ( 10 TL )\n");
                                    System.out.print("Tercihiniz: ");
                                    int icecek2 = klavye.nextInt();
                                    switch (icecek2) {
                                        case 1:
                                            System.out.println("1,5 porsiyon iskender ve coca cola tercih ettiniz fiyatı 90 TL .");
                                            b=1;
                                            break;
                                        case 2:
                                            System.out.println("1,5 porsiyon iskender ve sprite tercih ettiniz fiyatı 90 TL .");
                                            b=1;
                                            break;
                                        case 3:
                                            System.out.println("1,5 porsiyon iskender ve fanta tercih ettiniz fiyatı 90 TL .");
                                            b=1;
                                            break;
                                        case 4:
                                            System.out.println("1,5 porsiyon iskender ve ayran tercih ettiniz fiyatı 90 TL .");
                                            b=1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("1,5 porsiyon iskenderin yanına içecek tercih etmediniz fiyatı 75 TL .");
                                    b=1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    b=0;
                                }
                            }
                            break;
                        case 3:
                            int c=0;
                            System.out.println("İskender Duble Porsiyon tercih ettiniz.");
                            while(c==0) {
                                System.out.println("İçecek istiyor musunuz ? ( Evet ya da Hayır )");
                                System.out.print("Cevabınız: ");
                                String icecek = klavye.nextLine();
                                if (icecek.equalsIgnoreCase("evet")) {
                                    System.out.println("Hangi içecekten istiyorsunuz ? \n1-Coca Cola ( 15 TL)\n" +
                                            "2-Sprite ( 15 TL )\n" +
                                            "3-Fanta ( 15 TL )\n" +
                                            "4-Ayran ( 10 TL )\n");
                                    System.out.print("Tercihiniz: ");
                                    int icecek2 = klavye.nextInt();
                                    switch (icecek2) {
                                        case 1:
                                            System.out.println("Duble iskender ve coca cola tercih ettiniz fiyatı 115 TL .");
                                            c=1;
                                            break;
                                        case 2:
                                            System.out.println("Duble iskender ve sprite tercih ettiniz fiyatı 115 TL .");
                                            c=1;
                                            break;
                                        case 3:
                                            System.out.println("Duble iskender ve fanta tercih ettiniz fiyatı 115 TL .");
                                            c=1;
                                            break;
                                        case 4:
                                            System.out.println("Duble iskender ve ayran tercih ettiniz fiyatı 110 TL .");
                                            c=1;
                                            break;
                                    }
                                } else if (icecek.equalsIgnoreCase("hayır")) {
                                    System.out.println("Duble iskenderin yanına içecek tercih etmediniz fiyatı 100 TL .");
                                    c=1;
                                } else {
                                    System.out.println("Yanlış tuşlama yaptınız içecek ekranına tekrardan yönlendiriliyorsunuz...");
                                    c=0;
                                }
                            }
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
}

