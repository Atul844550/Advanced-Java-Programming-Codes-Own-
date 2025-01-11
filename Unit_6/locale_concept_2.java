import java.util.*;

class locale_concept_2 {

    public static void main(String args[])
    {
        Locale en = new Locale("en", "US");
        Locale fr = new Locale("fr", "FR");
        Locale es = new Locale("es", "ES");
        Locale sv = new Locale("sv", "SE");
        Locale da = new Locale("da", "DK");
        Locale zh = new Locale("zh", "CN");
        Locale ko = new Locale("ko", "KR");
       
        System.out.println("english language is represented by: -" + en.getDisplayLanguage());
        System.out.println("english language is represented by: -" + en.getDisplayLanguage(fr));
        System.out.println("english language is represented by: -" + en.getDisplayLanguage(es));
        System.out.println("english language is represented by: -" + en.getDisplayLanguage(sv));
        System.out.println("english language is represented by: -" + en.getDisplayLanguage(da));
        System.out.println("english language is represented by: -" + en.getDisplayLanguage(zh));
        System.out.println("english language is represented by: -" + en.getDisplayLanguage(ko));
    }
    
}
