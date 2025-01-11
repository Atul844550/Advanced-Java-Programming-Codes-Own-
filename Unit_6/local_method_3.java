import java.util.*;

class local_method_3 {

    public static void main(String args[])
    {
        Locale[] loc = {new Locale("en", "US"), new Locale("no", "NO"), new Locale("sv", "SE"), new Locale("es", "ES"), new Locale("zh", "CN")};

        for(int i=0; i<loc.length; i++)
        {
            String displayLanguage = loc[i].getDisplayLanguage(loc[i]);
            System.out.println(loc[i].toString()+ ":-" + displayLanguage);
        }
    }
}
    

