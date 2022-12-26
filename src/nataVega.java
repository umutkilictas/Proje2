import java.util.Scanner;

public class nataVega implements Avm {
    private boolean sinema;
    private boolean mağaza;
    private boolean yemek;
    private boolean özgüalan;
    public void nataVega() {  // CONSTRUCTOR

        Scanner klavye = new Scanner(System.in);
        System.out.println("\n1-Sinema\n" +
                "2-Mağaza\n" +
                "3-Yemek\n" +
                "4-Alışveriş Merkezine Özgü Alan\n");
        System.out.println("Natavega alışveriş merkezinde ne yapmak isterisiniz ? ");
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
            System.out.println("\n1-Issız Ada ( 35 TL )\n" +
                    "2-Recep İvedik 7 ( 30 TL )\n" +
                    "3-Avatar 2  ( 70 TL )\n" +
                    "4-Korku Seansı 3 ( 50 TL )\n");
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean mağaza() {
        if(this.mağaza==true){
            Scanner klavye=new Scanner(System.in);
            System.out.println("\n1-Lc Waikiki\n" +
                    "2-Defacto\n" +
                    "3-MediaMarkt\n" +
                    "4-Zen Pırlanta\n");
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
            System.out.println("\n1-Tavuk Dünyası\n" +
                    "2-Burger King\n" +
                    "3-Öncü Döner\n" +
                    "4-Helvacı Ali\n");
            System.out.print("Zincir restoranlardan hangisinde yemek yiyeceğinizi seçiniz: ");
            int yemeksecim=klavye.nextInt();
            switch (yemeksecim){
                case 1:
                    System.out.println("Tavuk Dünyasın'da yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-Kekiklim + Kola (80 TL)\n" +
                            "2-Baharatlım + Kola (70 TL)\n" +
                            "3-Kremantar + Kola (85 TL)\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü1=klavye.nextInt();
                    switch (menü1){
                        case 1:
                            System.out.println("Kekiklim menüsünü tercih ettiniz fiyatı 80 TL .");
                            break;
                        case 2:
                            System.out.println("Baharatlım menüsünü tercih ettiniz fiyatı 70 TL .");
                            break;
                        case 3:
                            System.out.println("Kremantar menüsünü tercih ettiniz fiyatı 85 TL .");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Burger King'de yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1- 2'li Tavukburger Menü ( 55TL )\n" +
                            "2- Whopper Menü ( 70 TL )\n" +
                            "3- King Chicken Menü ( 60 TL )\n");
                    System.out.print("Menü Seçiminiz: ");
                    int menü2=klavye.nextInt();
                    switch (menü2){
                        case 1:
                            System.out.println("2'li Tavukburger Menüyü tercih ettiniz fiyatı 55 TL .");
                            break;
                        case 2:
                            System.out.println("Whopper Menüyü tercih ettiniz fiyatı 70 TL .");
                            break;
                        case 3:
                            System.out.println("King Chicken Menüyü tercih ettiniz fiyatı 60 TL .");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Öncü Döner'de yemek yemeyi tercih ettiniz menüler listeleniyor...");
                    System.out.println("1-Zurna Dürüm Menü ( 65 TL )\n" +
                            "2-Normal Dürüm Menü ( 55 TL )\n" +
                            "3-Çift Lavaş Dürüm Menü ( 50 TL )\n");
                    System.out.print("Menü seçiminiz: ");
                    int menü3= klavye.nextInt();
                    switch (menü3){
                        case 1:
                            System.out.println("Zurna Dürüm Menüyü tercih ettiniz fiyatı 65 TL .");
                            break;
                        case 2:
                            System.out.println("Normal Dürüm Menüyü tercih ettiniz fiyatı 55 TL .");
                            break;
                        case 3:
                            System.out.println("Çift Lavaş Dürüm Menüyü tercih ettiniz fiyatı 50 TL .");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Helvacı Ali'den helva yemeyi tercih ettiniz helvalar listeleniyor...");
                    System.out.println("1- Standart İrmik Helvası (25 TL - 30TL - 35 TL)\n" +
                            "2-Çikolatalı İrmik Helvası (30 TL - 35 Tl - 40 TL)\n" +
                            "3-Cennet Çamuru (45 TL - 50 TL - 55 TL)\n");
                    System.out.print("Menü seçiminiz: ");
                    int menü4= klavye.nextInt();
                    switch (menü4){
                        case 1:
                            int a=0;
                            System.out.println("Standart İrmik Helvasını tercih ettiniz.");
                            while(a==0) {
                                System.out.println("\nHangi boyutta helva tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Standart İrmik Helvası tercih ettiniz fiyatı 25 TL .");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Standart İrmik Helvası tercih ettiniz fiyatı 30 TL .");
                                    a=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Standart İrmik Helvası tercih ettiniz fiyatı 35 TL .");
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
                            System.out.println("Çikolatalı İrmik Helvasını tercih ettiniz.");
                            while(b==0) {
                                System.out.println("\nHangi boyutta helva tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Çikolatalı İrmik Helvası tercih ettiniz fiyatı 30 TL .");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Çikolatalı İrmik Helvası tercih ettiniz fiyatı 35 TL .");
                                    b=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Çikolatalı İrmik Helvası tercih ettiniz fiyatı 40 TL .");
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
                            System.out.println("Cennet Çamurunu tercih ettiniz.");
                            while(c==0) {
                                System.out.println("\nHangi boyutta helva tercih edersiniz ? ( Küçük Orta Büyük )");
                                System.out.print("Tercihiniz: ");
                                String boyutsecim = klavye.nextLine();
                                if (boyutsecim.equalsIgnoreCase("küçük")) {
                                    System.out.println("Küçük boy Cennet Çamuru tercih ettiniz fiyatı 45 TL .");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("orta")) {
                                    System.out.println("Orta boy Cennet Çamuru tercih ettiniz fiyatı 50 TL .");
                                    c=1;
                                } else if (boyutsecim.equalsIgnoreCase("büyük")) {
                                    System.out.println("Büyük boy Cennet Çamuru tercih ettiniz fiyatı 55 TL .");
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

            }
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public boolean özgüalan() {
        if(this.özgüalan==true){
            System.out.println("\nNatavega alışveriş merkezinin diğer alışveriş merkezlerine göre özel olan eğlence alanı AQUAVEGA'dır ve giriş ücreti 70 TL dir ");
            return true;
        }
        else{
            return false;
        }
    }
}

