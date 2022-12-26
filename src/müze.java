import java.util.Scanner;

public class müze implements kullanicisecsin {

    @Override
    public void secenek() {
        for (int i=0;i<99;i++){
            System.out.println("Ankara bulunan gezebileceğiniz müzeler aşağıda listelenmiştir");
            System.out.println(" 1-Anıtkabir\n 2-Anadolu Medeniyetleri Müzesi\n 3-Rahmi Koç Müzesi\n 4-1.TBMM Kurtuluş Müzesi\n 5-Ulucanlar Cezaevi Müzesi\n 6-MTA Şehit Cuma Dağ Müzesi");
            System.out.println(" 7-Altınköy Açık Hava Müzesi\n 8-2.TBMM Cumhuriyet Meclisi\n 9-Etnografya Müzesi ");
            Scanner scanner = new Scanner(System.in);
            int muzesec = scanner.nextInt();
            switch (muzesec){
                case 1:
                    System.out.println("  Anıtkabir, Türk Kurtuluş Savaşı'nın ve inkılaplarının önderi ve Türkiye Cumhuriyeti'nin ilk Cumhurbaşkanı Mustafa Kemal Atatürk'ün," +
                            "\nAnkara Anıttepe'de (eski adıyla Rasattepe) bulunan anıt mezarıdır. Ayrıca dördüncü Cumhurbaşkanı Cemal Gürsel de 1966 yılında devrim şehitleri bölümüne defnedilmiştir." +
                            "\n1973'den beri İsmet İnönü'nün kabri de Anıtkabir'dedir.Rasattepe (Anıttepe) Anıtkabir yapılmadan önce rasat (gözlem) istasyonu bulunması dolayısıyla Anıttepe'nin ismi" +
                            "\nRasattepe idi. Anıtkabir projesinin belirlenmesinden sonra, ilk aşamada kamulaştırılma çalışmaları yapıldı ve 9 Ekim 1944 tarihinde yapıma başlandı. Anıtkabir'in inşası" +
                            "\n9 yıllık bir sürede 4 aşamalı olarak 1953 yılında tamamlandı.");
                    for (int k=0;k<99;k++){
                        System.out.println("Anıtkabire gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");                            i=100;
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
                case 2:
                    System.out.println("  1997’de “Avrupa’da Yılın Müzesi” seçilen ve kendine özgü koleksiyonları ile " +
                            "\ndünyanın sayılı müzeleri arasında yer alan Anadolu Medeniyetleri Müzesi’nde eserler, kronolojik " +
                            "\nolarak ayrılmış bölümlerde sergilenmektedir. Üst salonda Paleolitik Çağ, Kalkolitik Çağ, Eski Tunç Çağı," +
                            "\nAsur Ticaret Kolonileri Çağı, Eski Hitit ve Hitit İmparatorluk Çağı, Frig Krallığı, Geç Hitit Krallığı, Urartu Krallığı, " +
                            "\nve alt salonda ise Çağlar Boyu Ankara ve Klasik Devirler bölümleri yer almaktadır.");
                    System.out.println("Açılış/Kapanış Saatleri\n" +
                            "Açılış Saati: 08:30\n" +
                            "Kapanış Saati: 17:30\n" +
                            "Gişe Kapanış Saati: 17:15");
                    System.out.println("********************************************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Anadolu medeniyetleri müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
                        int onay= scanner.nextInt();
                        if (onay==1) {
                            System.out.println("*******İYİ EĞLENCELER DİLERİZ**********");                            i=100;
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
                case 3:
                    System.out.println("  Ankara’nın ilk sanayi müzesi olan Ankara Rahmi M. Koç Müzesi 2005 yılında ziyarete açılmıştır." +
                            "\nAnkara Kalesi ana giriş kapısının hemen karşısında, eskiden At Pazarı olarak anılan mevkide yer alan müze" +
                            "\niki ana binadan oluşmaktadır: Çengelhan ve Safranhan.");
                    System.out.println("Çalışma saatleri-Salı-Cuma: 10:00 - 17:00 Cumartesi-Pazar: 10:00 - 18:00 Pazartesi: Kapalı");
                    for (int k=0;k<99;k++){
                        System.out.println("Rahmi Koç müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                    System.out.println("  Ankara Ulus meydanında bulunan I. Türkiye Büyük Millet Meclisi binasının inşaasına, 1915 yılında başlanmıştır. İlkin İttihat ve Terakki Cemiyeti kulüp binası olarak tasarlanmış binanın planı evkaf mimarı Salim Bey tarafından yapılmış, inşasına ise kolordunun askeri mimarı Hasip Bey nezaret etmiştir.\n" +
                            "\nTürk mimari stilinde olan iki katlı binanın en belirgin özelliği duvarlarında Ankara taşı (ANDEZİT) kullanılmış olmasıdır." +
                            "\nMeclisin, 23 Nisan 1920'de bu binada toplanması kararlaştırıldığında henüz bitirilmemiş olan bina, milli bir heyecanın eseri olarak milletin katkısıyla tamamlanmıştır.");
                    System.out.println("********************************************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Kurtuluş savaşı müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                    System.out.println("  Ulucanlar Cezaevi farklı yıllarda Türk siyasi ve edebi hayatına damga vurmuş şahsiyetleri ağırladı.Ulucanlar’dan" +
                            "\nşairler ,gazeteciler ,edebiyatçılar hiç eksik olmadı…Necip Fazıl Kısakürek,Nazım Hikmet,Ahmet Arif,Hasan Hüseyin Korkmazgil," +
                            "\nOral Çalışlar ,İpek Çalışlar,Beyhan Cenkçi,Adnan Cemgil,Cüneyt Arcayürek,Fakir Baykurt,Metin Toker…");
                    System.out.println("************************************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Ulucanlar Cezaevi müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                    System.out.println("  Türkiye’nin ilk ve en büyük tabiat tarihi müzesidir." +
                            "\nMaden Tetkik ve Arama Genel Müdürlüğü bünyesinde 7 Şubat 1968 tarihinde, kurumun arazi çalışmalarında toplanan örneklerin sergilenmesi ve" +
                            "\ndepolanması amacıyla kurulmuştur. Müze, yerleşke içinde yapılan yeni binasında hizmet vermeye devam etmektedir." +
                            "\nTürkiye’nin ve dünyanın çeşitli yerlerinden derlenmiş, doğa tarihini anlatan çok sayıda fosil, kayaç, mineral ve maden örnekleri müzede sergilenmektedir." +
                            "\nÜç kattan oluşan müzenin giriş katında uzaya yolculuk yapacak, güneş sistemi içindeki gezegenleri yakından tanıyacak, ay taşı, yıldırım taşı ve" +
                            "\nuzayın postacıları olan gök taşlarını inceleme fırsatı bulunmaktadır.");
                    System.out.println("****************************************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println(" MTA müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                case 7:
                    System.out.println("  Bir Anadolu köyünde görebileceğiniz tüm yapılar ve daha fazlasını burada görebilir ve" +
                            "\nhissedebilirsiniz. Hissedebilirsiniz diyorum çünkü bir ekmek fırınında ekmek pişirilirken kokusunu" +
                            "\nalabilir, Su değirmeninde öğütülen mısırın kokusunun farkına varabilirsiniz. Köy hayvanlarınında" +
                            "\nbulunduğu bölgede tarla ve çeşitli ağaçlarıda görebilmek mümkün.");
                    System.out.println("***********************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Altınköy açık hava müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                case 8:
                    System.out.println("  Müze giriş kapısının karşısında yer alan  Genel Kurul Salonu, 1924-1960 yılları arasında " +
                            "\nTürkiye Büyük Millet Meclisi Genel Kurul Salonu olarak kullanılmış ve seçim dönemlerine göre milletvekili" +
                            "\n sayısı 610 milletvekiline kadar çıkmıştır. Salonda toplam 116 adet milletvekili sırası bulunmaktadır." +
                            "\n1924-1960 yılları arasında bu salonda Atatürk ilke ve devrimleri gerçekleştirilmiş.");
                    System.out.println("Cumhuriyet Müzesi Ziyaret Saatleri Yaz Dönemi: 08:45 - 19:00 (15 Nisan-31 Ekim)" +
                            "\nCumhuriyet Müzesi Ziyaret Saatleri Kış Dönemi: 08:45 - 18:00 (1 Kasım-14 Nisan)" +
                            "\nCumhuriyet Müzesi Tatil Günleri: Dini Bayramların ilk günü 13:00'e kadar");
                    System.out.println("*********************************************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("2.TBMM Açık Hava  müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                case 9:
                    System.out.println("  Koleksiyonunda; Anadolu'nun çeşitli yörelerinden derlenmiş halk giysileri, süs eşyaları," +
                            "\nayakkabı, takunya örnekleri, Sivas yöresi kadın ve erkek çorapları, çeşitli keseler, oyalar, çevreler," +
                            "\nuçkurlar, peşkirler, bohçalar, yatak örtüleri, gelin kıyafetleri, damat tıraş takımları, çeşitli yörelerden " +
                            "\nhalı ve kilimler, Anadolu maden sanatını temsil eden çok çeşitli eserler, Osmanlı Devri yayları, okları," +
                            "\nçakmaklı tabancalar, tüfekler kılıç ve yatağanlar, Türk çini porselenleri ve Kütahya porselenleri, tasavvuf ve" +
                            "\ntarikatla ilgili eşyalar, Türk yazı sanatının güzel örneklerinden levhalar bulunmaktadır.");
                    System.out.println("******************************************************************************");
                    for (int k=0;k<99;k++){
                        System.out.println("Etnografya  müzesine gitmeyi onaylıyorsanız 1 e onaylamıyorsanız 2 yi tuşlayın.");
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
                    System.out.println("     \nHatalı tuşlama yaptınız");
                    System.out.println("*************************************");
                    i=0;

            }

        }}

}
