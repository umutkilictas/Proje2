import java.util.Scanner;

public class randompark implements kullanicisecsin{

    @Override
    public void secenek() {
        Scanner scanner= new Scanner(System.in);
        String parklar[]={"Eymir Gölü","Gençlik Parkı","Dikmen Vadisi","Göksu Parkı","Anfa Altınpark","Seğmenler Parkı","Mogan Gölü","Ahlatlıbel Tesisleri Parkı","Kuğulu Park","50.yıl Parkı","Atatürk Orman Çiftliği","Harikalar Diyarı","Kurtuluş Parkı"};
            random random1=new random();
            switch (random1.randoma(13)){
                case 0:
                    System.out.println(parklar[0]+"'nü ziyaret edebilirsiniz!\n" +
                            "Piknik bisikletlet sürmek gibi birçok aktivite yapabileceğiniz Eymir gölü kenarında " +
                            "isterseniz cafe ve restoranlarda oturupta vakit geçirebilirsiniz");
                    System.out.println("Giriş saatleri=05.00-22.00");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                     break;
                case 1:
                    System.out.println(parklar[1]+"'nı ziyaret edebilirsiniz!\n"
                            +"275 bin metrekare alan üzerine kurulan park, 2008-2009 yıllarında revize edilmiş olup," +
                            " 44 bin 296 metrekare havuz alanı ve 70 bin 422 metrekare çim alan yer almaktadır." +
                            " 1.029 metrekare çocuk oyun alanı, 25 bin metrekare lunapark, 10 bin metrekare opera binası ile" +
                            " 8 bin metrekare, 638 kişilik Ankara'nın en büyük tiyatro salonlarından Ankara Büyükşehir Belediye Tiyatrosu bulunmaktadır. \n" +
                            "\n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 2:
                    System.out.println(parklar[2]+"'ni ziyaret edebilirsiniz!\n" +
                            "Çocuklar için bir eğlence parkı, sporcular için kondisyon alanı ve koşu yolu, 9 adet kafe ve restoranı," +
                            " 34 bin m2lik havuz alanı ve çim alanları ile Ankara’nın orta yerinde yer alan bu dinlence mekanı; güvenliği, temizliği ve her ihtiyaca cevap veren" +
                            " donanımlarıyla  ailelerin, çocukların, gençlerin saatlerce hiç sıkılmadan vakit geçirebileceği bir yerdir.\n" +
                            "\n" +
                            "Park içerisinde, zihinsel engelli okulu ile 2 adet camii de bulunmaktadır. İki farklı idari binası olan Dikmen Vadisi Parkı, gece aydınlatması ile de 24 saat hayatın olduğu bir yaşam alanıdır.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 3:
                    System.out.println(parklar[3]+"'nı ziyaret edebilirsiniz!\n" +
                            "Yelken Kaskatlı Ada Restoran, Tepe Restoran, cay bahçeleri, sinema salonunun bulunduğu 13.000 m2 lik piknik alanı yer alır." +
                            " Türkiye’de ilk kez uygulanan eğlence ve adrenalin bir arada yaşandığı Dağ Kızağı da parkın etkinlikleri arasında yer alır." +
                            " İskele boyunca uzanan 1,6 km lik yürüme yolu,kuşbakışı seyir imkanı sağlayan deniz feneri ve daha birçok etkinlikleriyle Ankara’nın görülmeye ve" +
                            " gezilmeye değer gözde mekanları arasındadır.\n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 4:
                    System.out.println(parklar[4]+"'ı ziyaret edebilirsiniz!\n" +
                            "Bilim Merkezi, uluslararası standartlarda fuar ve kongre merkezi, anaokulu ve yaz okulu, büfe ve lokantaları," +
                            " müzikli ve ışıklı su gösterileri, oyun ve eğlence alanları, göl kıyısındaki amfileri, paten alanı, kayıkları, çarpışan botları," +
                            " elektrikli gezinti arabaları, mini gezinti treni, atları, otoparkları ile Altınpark'ta hayatın bütün renklerini bulmak mümkündür.\n" +
                            "\n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 5:
                    System.out.println(parklar[5]+"'nı ziyaret edebilirsiniz!\n" +
                            "Seğmenler Parkı, 46 bin 379 m2lik çim alanda, göleti, serası, spor alanları ve bitki örtüsü ile" +
                            " Başkentlilerin doğa ile baş başa kalabildiği bir yaşam alanıdır. Şirin kulübeleri, masa ve bankları ile hem gençlerin hem de ailelerin uğrak yeridir.\n" +
                            "\n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 6:
                    System.out.println(parklar[6]+"'nü ziyaret edebilirsiniz!\n" +
                            "Ahşap kıyı yolu, koşu ve yürüyüş yolları ile Ankara’nın bir başka sahil kasabası görünümündeki parklarından biri olan Mogan’da; " +
                            "piknik alanları, asma köprülerle ulaşımın sağlandığı sevgi adası, çocuklar için oyun ve park alanları, engelli miniklerin gönlünce vakit " +
                            "geçirebileceği özel tasarlanmış oyun bölümleri, istasyonlu koşu pisti, 3 adet tenis kortu, 2 adet mini futbol sahası ve basketbol sahaları vardır.\n" +
                            "\n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 7:
                    System.out.println(parklar[7]+"'nı ziyaret edebilirsiniz!\n" +
                            "Çimlerine özgürce basılan yemyeşil bir dünya\\n25.300 m² çim alan\\n180.000 m² orman alan\\n1.500 araçlık otopark\\nŞehrin içinde ama şehirden uzak\\nÇocuklar için güvenli oyun alanları\\n\" +\n" +
                            "Tertemiz havada değişik yiyecek olanakları\\n3 tenis kortu, 2 halı saha, 3 basketbol sahası, 2 voleybol sahası\\Koşu ve yürüyüş parkurları\\nGolf sahası\\nUçurtma imkânı\\n\" +\n" +
                            "Evcil hayvanları gezdirme alanı\\nBisiklet yolu\\nPiknik alanı\\nKafeteryalar\\nBir çok kondisyon aletinin bulunduğu açık hava spor bahçesi\\nAhlatlıbel Atatürk Parkı ve ODTÜ ormanlarında çıkacak yangınlara karşı oluşturulan bir mini filo\\n\" +\n" +
                            "Her hafta sonu ortalama 50 bin Ankaralıya ev sahipliği\\n24 saat güvenlik ");
                    break;
                case 8:
                    System.out.println(parklar[8]+"'ı ziyaret edebilirsiniz!\n" +
                            "Kavaklıdere semtinde yer alan bu park kuğuları ile ünlüdür. Havuzda kuğular ve ördekler parkın içinde gezinirler." +
                            " Çocuk bahçesi ve kafeterya halkın hizmetindedir. Ankara merkezde yer alan bu park, muhteşem tabiatı ve ev sahipliği yaptığı kuğuları ile" +
                            " şehir dışından gelenlerin mutlaka görmek istedikleri bir durak olmanın haricinde Ankarılaların da stres attıklar, şehir içinde orman havası soludukları " +
                            "bir noktadır. Ankara'nın sembollerinden olan Kuğulu Park, özellikle kış aylarında kar yağışı ile doyumsuz manzalar, muhteşem görüntüler vermektedir.\n" +
                            "\n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 9:
                    System.out.println(parklar[9]+"'nı ziyaret edebilirsiniz!\n" +
                            "Yaklaşık 130 bin metrekarelik alanı kaplayan parkta 3 bin 500 metrekarelik ve bin 300 metrekarelik iki ayrı gölet, derelerle birbirine " +
                            "bağlanırken irili ufaklı pek çok süs balığına da ev sahipliği yapıyor.\nParkta çeşmeler, bin 100 metrekarelik 4 çocuk oyunu alanı ile 1 adet de" +
                            " buz pateni pisti bulunuyor. Büyük ilgi gören yerlerden biri de çocuklar için tasarlanmış yaklaşık 10 bin 500 metrekarelik mini lunapark. " +
                            "Dönme dolap, çarpışan arabalar, salıncak her zaman çocukların gözdesi oluyor.  \n");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 10:
                    System.out.println(parklar[10]+"'ni ziyaret edebilirsiniz!\n" +
                            "6 dönümlük alanın rehabilite edilmesiyle kurulan parkımızda, çocuk oyun alanları, oturma alanları, dişbudak, akçaağaç, meşe, karaçam," +
                            " sedir gibi ağaçlar yer alıyor. Parkta, 500 adet gülün bulunduğu gül bahçesi, havuz, mevsim çiçeklerinden yapılan peyzajlar da bulunuyor. ");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 11:
                    System.out.println(parklar[11]+"'nı ziyaret edebilirsiniz!\n" +
                            ". Açık otoparkları, parkın konseptine uygun tasarlanmış yapıları, go-kart, kaykay pisti, model gemi yüzdürme alanı, model araba pisti, halı sahalar," +
                            " basket sahaları, tenis kortları ile ziyaretçilerini ağırlayan Harikalar Diyarı,Ankara’nın huzur ve eğlenceyi bir arada sunan konsept mekanlarının başında gelmektedir.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 12:
                    System.out.println(parklar[12]+"'nı ziyaret edebilirsiniz!\n" +
                            "Ankara’nın eski parklarından biri olan Kurtuluş Parkı 2000 yılında revize edilmiştir.\n" +
                            "86.200 m2 toplam alana sahip parkta 49.000 m2 çim alan ile 2.000 m2 havuz alanı bulunmaktadır.10.000 m2 sini piknik alanının oluşturduğu parkta" +
                            " 3.000 m2 çocuk oyun alanı ile 200 m2 spor alanı yer almaktadır.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
            }

    }
}
