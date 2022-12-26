import java.util.Scanner;

public class randommuze implements kullanicisecsin {

    @Override
    public void secenek() {
        Scanner scanner=new Scanner(System.in);
        String muzeler[]={"Anıtkabir","Anadolu Medeniyetler Müzesi","Rahmi Koç Müzesi","1.TBMM Kurtuluş Müzesi","Ulucanlar Cezaevi Müzesi","MTA Şehit Cuma Dağ Müzesi","Altınköy Açık Hava Müzesi","2.TBMM Cumhuriyet Müzesi","Etnografya Müzesi"};
            random random1=new random();
            switch (random1.randoma(9)){
                case 0:
                    System.out.println(muzeler[0]+"'i ziyaret edebilirsiniz!\n" +
                            "Anıtkabir, Türk Kurtuluş Savaşı'nın ve inkılaplarının önderi ve Türkiye Cumhuriyeti'nin ilk Cumhurbaşkanı Mustafa Kemal Atatürk'ün, Ankara Anıttepe'de (eski adıyla Rasattepe) bulunan anıt mezarıdır. Ayrıca dördüncü Cumhurbaşkanı Cemal Gürsel de 1966 yılında devrim şehitleri bölümüne defnedilmiştir (6 Kasım 1981 tarihli Devlet Mezarlığı Kanunu 1.madde 2.fıkra gereğince, 27 Ağustos 1988'de çıkartıldı). 1973'den beri İsmet İnönü'nün kabri de Anıtkabir'dedir."+
                            "Rasattepe (Anıttepe) Anıtkabir yapılmadan önce rasat (gözlem) istasyonu bulunması dolayısıyla Anıttepe'nin ismi Rasattepe idi. 906 rakımlı bu tepede, MÖ. 12. yüzyılda Anadolu'da devlet kuran Frig uygarlığına ait tümülüsler (mezar yapıları) bulunmaktaydı. Anıtkabir'in Rasattepe'de yapılmasına karar verildikten sonra bu tümülüslerin kaldırılması için arkeolojik kazılar yapıldı. Bu tümülüslerden çıkarılan eserler, Anadolu Medeniyetleri Müzesi'nde sergilenmektedir."+
                            "Anıtkabir projesinin belirlenmesinden sonra, ilk aşamada kamulaştırılma çalışmaları yapıldı ve 9 Ekim 1944 tarihinde yapıma başlandı. Anıtkabir'in inşası 9 yıllık bir sürede 4 aşamalı olarak 1953 yılında tamamlandı.");

                    break;
                case 1:
                    System.out.println(muzeler[1]+"'ni ziyaret edebilirsiniz!\n"+
                            " 1997’de “Avrupa’da Yılın Müzesi” seçilen ve kendine özgü koleksiyonları ile " +
                            " dünyanın sayılı müzeleri arasında yer alan Anadolu Medeniyetleri Müzesi’nde eserler, kronolojik " +
                            " olarak ayrılmış bölümlerde sergilenmektedir. Üst salonda Paleolitik Çağ, Kalkolitik Çağ, Eski Tunç Çağı," +
                            " Asur Ticaret Kolonileri Çağı, Eski Hitit ve Hitit İmparatorluk Çağı, Frig Krallığı, Geç Hitit Krallığı, Urartu Krallığı, " +
                            " ve alt salonda ise Çağlar Boyu Ankara ve Klasik Devirler bölümleri yer almaktadır.");
                    System.out.println("Açılış/Kapanış Saatleri\n" +
                            "Açılış Saati: 08:30\n" +
                            "Kapanış Saati: 17:30\n" +
                            "Gişe Kapanış Saati: 17:15");
                    break;
                case 2:
                    System.out.println(muzeler[2]+"'ni ziyaret edebilirsiniz!\n"+
                            "Ankara’nın ilk sanayi müzesi olan Ankara Rahmi M. Koç Müzesi 2005 yılında ziyarete açılmıştır." +
                            " Ankara Kalesi ana giriş kapısının hemen karşısında, eskiden At Pazarı olarak anılan mevkide yer alan müze" +
                            " iki ana binadan oluşmaktadır: Çengelhan ve Safranhan.\n" +
                            "\n ");
                    System.out.println("Çalışma saatleri-Salı-Cuma: 10:00 - 17:00 Cumartesi-Pazar: 10:00 - 18:00 Pazartesi: Kapalı");
                    break;
                case 3:
                    System.out.println(muzeler[3]+"'ni ziyaret edebilirsiniz!\n"+
                            "Ankara Ulus meydanında bulunan I. Türkiye Büyük Millet Meclisi binasının inşaasına, 1915 yılında başlanmıştır. İlkin İttihat ve Terakki Cemiyeti kulüp binası olarak tasarlanmış binanın planı evkaf mimarı Salim Bey tarafından yapılmış, inşasına ise kolordunun askeri mimarı Hasip Bey nezaret etmiştir.\n" +
                            "Türk mimari stilinde olan iki katlı binanın en belirgin özelliği duvarlarında Ankara taşı (ANDEZİT) kullanılmış olmasıdır.\n" +
                            "Meclisin, 23 Nisan 1920'de bu binada toplanması kararlaştırıldığında henüz bitirilmemiş olan bina, milli bir heyecanın eseri olarak milletin katkısıyla tamamlanmıştır.");
                    break;
                case 4:
                    System.out.println(muzeler[4]+"'ni ziyaret edebilirsiniz!\n"+
                            "Ulucanlar Cezaevi farklı yıllarda Türk siyasi ve edebi hayatına damga vurmuş şahsiyetleri ağırladı.Ulucanlar’dan şairler ,gazeteciler ,edebiyatçılar hiç eksik olmadı…Necip Fazıl Kısakürek,Nazım Hikmet,Ahmet Arif,Hasan Hüseyin Korkmazgil,Oral Çalışlar ,İpek Çalışlar,Beyhan Cenkçi,Adnan Cemgil,Cüneyt Arcayürek,Fakir Baykurt,Metin Toker…\n" +
                            "\n");
                    break;
                case 5:
                    System.out.println(muzeler[5]+"'ni ziyaret edebilirsiniz!\n"+
                            "Türkiye’nin ilk ve en büyük tabiat tarihi müzesidir." +
                            " Maden Tetkik ve Arama Genel Müdürlüğü bünyesinde 7 Şubat 1968 tarihinde, kurumun arazi çalışmalarında toplanan örneklerin sergilenmesi ve" +
                            " depolanması amacıyla kurulmuştur. Müze, yerleşke içinde yapılan yeni binasında hizmet vermeye devam etmektedir." +
                            " Türkiye’nin ve dünyanın çeşitli yerlerinden derlenmiş, doğa tarihini anlatan çok sayıda fosil, kayaç, mineral ve maden örnekleri müzede sergilenmektedir." +
                            " Üç kattan oluşan müzenin giriş katında uzaya yolculuk yapacak, güneş sistemi içindeki gezegenleri yakından tanıyacak, ay taşı, yıldırım taşı ve" +
                            " uzayın postacıları olan gök taşlarını inceleme fırsatı bulunmaktadır.\n" +
                            "\n");
                    break;
                case 6:
                    System.out.println(muzeler[6]+"'ni ziyaret edebilirsiniz!\n"+
                            "Bir Anadolu köyünde görebileceğiniz tüm yapılar ve daha fazlasını burada görebilir ve" +
                            " hissedebilirsiniz. Hissedebilirsiniz diyorum çünkü bir ekmek fırınında ekmek pişirilirken kokusunu" +
                            " alabilir, Su değirmeninde öğütülen mısırın kokusunun farkına varabilirsiniz. Köy hayvanlarınında" +
                            " bulunduğu bölgede tarla ve çeşitli ağaçlarıda görebilmek mümkün.");
                    break;
                case 7:
                    System.out.println(muzeler[7]+"'ni ziyaret edebilirsiniz!\n"+
                            "Müze giriş kapısının karşısında yer alan  Genel Kurul Salonu, 1924-1960 yılları arasında " +
                            " Türkiye Büyük Millet Meclisi Genel Kurul Salonu olarak kullanılmış ve seçim dönemlerine göre milletvekili" +
                            " sayısı 610 milletvekiline kadar çıkmıştır. Salonda toplam 116 adet milletvekili sırası bulunmaktadır." +
                            " 1924-1960 yılları arasında bu salonda Atatürk ilke ve devrimleri gerçekleştirilmiş.");
                    System.out.println("Cumhuriyet Müzesi Ziyaret Saatleri Yaz Dönemi: 08:45 - 19:00 (15 Nisan-31 Ekim)\n" +
                            "Cumhuriyet Müzesi Ziyaret Saatleri Kış Dönemi: 08:45 - 18:00 (1 Kasım-14 Nisan)\n" +
                            "Cumhuriyet Müzesi Tatil Günleri: Dini Bayramların ilk günü 13:00'e kadar\n");
                    break;
                case 8:
                    System.out.println(muzeler[8]+"'ni ziyaret edebilirsiniz!\n"+
                            "Koleksiyonunda; Anadolu'nun çeşitli yörelerinden derlenmiş halk giysileri, süs eşyaları," +
                            " ayakkabı, takunya örnekleri, Sivas yöresi kadın ve erkek çorapları, çeşitli keseler, oyalar, çevreler," +
                            " uçkurlar, peşkirler, bohçalar, yatak örtüleri, gelin kıyafetleri, damat tıraş takımları, çeşitli yörelerden " +
                            " halı ve kilimler, Anadolu maden sanatını temsil eden çok çeşitli eserler, Osmanlı Devri yayları, okları," +
                            " çakmaklı tabancalar, tüfekler kılıç ve yatağanlar, Türk çini porselenleri ve Kütahya porselenleri, tasavvuf ve" +
                            " tarikatla ilgili eşyalar, Türk yazı sanatının güzel örneklerinden levhalar bulunmaktadır.");
                    break;

            }

        }

}

