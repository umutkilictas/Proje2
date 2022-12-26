
import java.util.Scanner;

public class park implements kullanicisecsin{

    @Override
    public void secenek() {
        for (int i=0; i<99;i++){
            System.out.println("Ankarada bulunan parklar aşağıda listelenmiştir");
            System.out.println(" 1-Eymir Gölü\n 2-Gençlik Parkı\n 3-Dikmen Vadisi\n 4-Göksu Park\n 5-Anfa Altınpark\n 6-Seğmenler Parkı\n " +
                    "7-Mogan Gölü\n 8-Ahlatlıbel Tesisleri Parkı\n 9-Kuğulu park\n 10-50.yıl parkı\n 11-Atatürk orman çiftliği\n " +
                    "12-Harikalar diyarı\n 13-Kurtuluş parkı ");
            Scanner scanner= new Scanner(System.in);
            int parksec = scanner.nextInt();
            switch (parksec){
                case 1:
                    System.out.println("  Piknik bisikletlet sürmek gibi birçok aktivite yapabileceğiniz Eymir gölü kenarında " +
                            "\nisterseniz cafe ve restoranlarda oturupta vakit geçirebilirsiniz");
                    System.out.println("**********************************************************");
                    System.out.println("Giriş saatleri=05.00-22.00");
                    for (int k=0;k<99;k++){
                        System.out.println("Eymir gölüne  gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    } break;
                case 2:
                    System.out.println("  275 bin metrekare alan üzerine kurulan park, 2008-2009 yıllarında revize edilmiş olup," +
                            "\n44 bin 296 metrekare havuz alanı ve 70 bin 422 metrekare çim alan yer almaktadır." +
                            "\n1.029 metrekare çocuk oyun alanı, 25 bin metrekare lunapark, 10 bin metrekare opera binası ile" +
                            "\n8 bin metrekare, 638 kişilik Ankara'nın en büyük tiyatro salonlarından Ankara Büyükşehir Belediye Tiyatrosu bulunmaktadır. ");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Gençlik parkına gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 3:
                    System.out.println("  Çocuklar için bir eğlence parkı, sporcular için kondisyon alanı ve koşu yolu, 9 adet kafe ve restoranı," +
                            "\n34 bin m2lik havuz alanı ve çim alanları ile Ankara’nın orta yerinde yer alan bu dinlence mekanı; güvenliği, temizliği ve her ihtiyaca cevap veren" +
                            "\ndonanımlarıyla  ailelerin, çocukların, gençlerin saatlerce hiç sıkılmadan vakit geçirebileceği bir yerdir." +
                            "\nPark içerisinde, zihinsel engelli okulu ile 2 adet camii de bulunmaktadır. İki farklı idari binası olan Dikmen Vadisi Parkı, gece aydınlatması ile de" +
                            "\n24 saat hayatın olduğu bir yaşam alanıdır.");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Dikmen vadisine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 4:
                    System.out.println("  Yelken Kaskatlı Ada Restoran, Tepe Restoran, cay bahçeleri, sinema salonunun bulunduğu 13.000 m2 lik piknik alanı yer alır." +
                            "\nTürkiye’de ilk kez uygulanan eğlence ve adrenalin bir arada yaşandığı Dağ Kızağı da parkın etkinlikleri arasında yer alır." +
                            "\nİskele boyunca uzanan 1,6 km lik yürüme yolu,kuşbakışı seyir imkanı sağlayan deniz feneri ve daha birçok etkinlikleriyle Ankara’nın görülmeye ve" +
                            "\ngezilmeye değer gözde mekanları arasındadır.\n");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Göksu parkına gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 5:
                    System.out.println("  Bilim Merkezi, uluslararası standartlarda fuar ve kongre merkezi, anaokulu ve yaz okulu, büfe ve lokantaları," +
                            "\nmüzikli ve ışıklı su gösterileri, oyun ve eğlence alanları, göl kıyısındaki amfileri, paten alanı, kayıkları, çarpışan botları," +
                            "\nelektrikli gezinti arabaları, mini gezinti treni, atları, otoparkları ile Altınpark'ta hayatın bütün renklerini bulmak mümkündür.\n");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Altınparka onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 6:
                    System.out.println("  Seğmenler Parkı, 46 bin 379 m2lik çim alanda, göleti, serası, spor alanları ve bitki örtüsü ile" +
                            "Başkentlilerin doğa ile baş başa kalabildiği bir yaşam alanıdır. Şirin kulübeleri, masa ve bankları ile hem gençlerin hem de ailelerin uğrak yeridir.\n" +
                            "\n");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Seğmenler parkına gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    } break;
                case 7:
                    System.out.println(" Ahşap kıyı yolu, koşu ve yürüyüş yolları ile Ankara’nın bir başka sahil kasabası görünümündeki parklarından biri olan Mogan’da; " +
                            "\npiknik alanları, asma köprülerle ulaşımın sağlandığı sevgi adası, çocuklar için oyun ve park alanları, engelli miniklerin gönlünce vakit " +
                            "\ngeçirebileceği özel tasarlanmış oyun bölümleri, istasyonlu koşu pisti, 3 adet tenis kortu, 2 adet mini futbol sahası ve basketbol sahaları vardır.\n");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Mogan gölüne onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }
                    break;
                case 8:
                    System.out.println("  Çimlerine özgürce basılan yemyeşil bir dünya\\n25.300 m² çim alan\\n180.000 m² orman alan\\n1.500 araçlık otopark\\nŞehrin içinde ama şehirden uzak\\nÇocuklar için güvenli oyun alanları\\n\" +\n" +
                            "\n Tertemiz havada değişik yiyecek olanakları\\n3 tenis kortu, 2 halı saha, 3 basketbol sahası, 2 voleybol sahası\\nKoşu ve yürüyüş parkurları\\nGolf sahası\\nUçurtma imkânı\\n\" +\n" +
                            "\n Evcil hayvanları gezdirme alanı\\nBisiklet yolu\\nPiknik alanı\\nKafeteryalar\\nBir çok kondisyon aletinin bulunduğu açık hava spor bahçesi\\nAhlatlıbel Atatürk Parkı ve ODTÜ ormanlarında çıkacak yangınlara karşı oluşturulan bir mini filo\\n\" +\n" +
                            "\nHer hafta sonu ortalama 50 bin Ankaralıya ev sahipliği\\n24 saat güvenlik ");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Ahlatlıbel tesislerine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    } break;
                case 9:
                    System.out.println("  Kavaklıdere semtinde yer alan bu park kuğuları ile ünlüdür. Havuzda kuğular ve ördekler parkın içinde gezinirler." +
                            "\nÇocuk bahçesi ve kafeterya halkın hizmetindedir. Ankara merkezde yer alan bu park, muhteşem tabiatı ve ev sahipliği yaptığı kuğuları ile" +
                            "\nşehir dışından gelenlerin mutlaka görmek istedikleri bir durak olmanın haricinde Ankarılaların da stres attıklar, şehir içinde orman havası soludukları " +
                            "\nbir noktadır. Ankara'nın sembollerinden olan Kuğulu Park, özellikle kış aylarında kar yağışı ile doyumsuz manzalar, muhteşem görüntüler vermektedir.\n" +
                            "\n");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Kuğulu parka gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 10:
                    System.out.println("  Yaklaşık 130 bin metrekarelik alanı kaplayan parkta 3 bin 500 metrekarelik ve bin 300 metrekarelik iki ayrı gölet, derelerle birbirine " +
                            "\nbağlanırken irili ufaklı pek çok süs balığına da ev sahipliği yapıyor.\nParkta çeşmeler, bin 100 metrekarelik 4 çocuk oyunu alanı ile 1 adet de" +
                            "\nbuz pateni pisti bulunuyor. Büyük ilgi gören yerlerden biri de çocuklar için tasarlanmış yaklaşık 10 bin 500 metrekarelik mini lunapark. " +
                            "\nDönme dolap, çarpışan arabalar, salıncak her zaman çocukların gözdesi oluyor.  \n");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("50.yıl parkına gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 11:
                    System.out.println(" 6 dönümlük alanın rehabilite edilmesiyle kurulan parkımızda, çocuk oyun alanları, oturma alanları, dişbudak, akçaağaç, meşe, karaçam," +
                            "\nsedir gibi ağaçlar yer alıyor. Parkta, 500 adet gülün bulunduğu gül bahçesi, havuz, mevsim çiçeklerinden yapılan peyzajlar da bulunuyor. ");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Atatürk Orman çiftliğine onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 12:
                    System.out.println("  Açık otoparkları, parkın konseptine uygun tasarlanmış yapıları, go-kart, kaykay pisti, model gemi yüzdürme alanı, model araba pisti, halı sahalar," +
                            "\nbasket sahaları, tenis kortları ile ziyaretçilerini ağırlayan Harikalar Diyarı,Ankara’nın huzur ve eğlenceyi bir arada sunan konsept mekanlarının başında gelmektedir.");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Harikalar diyerına gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                case 13:
                    System.out.println("  Ankara’nın eski parklarından biri olan Kurtuluş Parkı 2000 yılında revize edilmiştir.\n" +
                            "86.200 m2 toplam alana sahip parkta 49.000 m2 çim alan ile 2.000 m2 havuz alanı bulunmaktadır.10.000 m2 sini piknik alanının oluşturduğu parkta" +
                            "\n3.000 m2 çocuk oyun alanı ile 200 m2 spor alanı yer almaktadır.");
                    System.out.println("**********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Kurtuluş parkına gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");
                            i=100;
                            k=100;
                        } else if (onay==2) {
                            System.out.println("Bir önceki menüye yönlendiriliyorsunuz");
                            i=0;
                            k=100;
                        }
                        else{
                            System.out.println("Hatalı tuşlama yaptınız");
                            k=0;
                        }
                    }break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız");
                    i=0;
            }
        }
    }
}
