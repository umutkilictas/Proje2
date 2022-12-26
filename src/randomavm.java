import java.util.Scanner;
public class randomavm {
    String avmler[]={"NataVega","Ankamall","Armada","ForumAnkara"};
    public void calistir() {

            random random1=new random();
            switch (random1.randoma(4)) {
                case 0:

                    System.out.println(avmler[0]+"yı ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>NATAVEGA' ya göz atabilirsiniz.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                break;
                case 1:

                    System.out.println(avmler[1]+" AVM'yi ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>NATAVEGA' ya göz atabilirsiniz.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 2:

                    System.out.println(avmler[2]+"yı ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>NATAVEGA' ya göz atabilirsiniz.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
                case 3:

                    System.out.println(avmler[3]+"yı ziyaret edebilirsiniz! \nBu AVM'ye özgü alan,mağazalar, ve daha fazlası hakkında bilgi almak için ana menüden KENDİM SEÇMEK İSTİYORUM>AVMLER>NATAVEGA' ya göz atabilirsiniz.");
                    System.out.println("\n***** İYİ EĞLENCELER DİLERİZ *****");
                    break;
            }

    }
}
