package TestMenu;

import java.util.Locale;
public class LocaleDemo
{
    public static void main(String[] args) 
    {  /*Demos All Locale in this world
        
	Locale[] localeList = Locale.getAvailableLocales();
        for (Locale Lo: localeList) System.out.println(Lo);
       
        */
        Locale locale = Locale.getDefault();
		System.out.println("Language        : " + locale.getLanguage());
		System.out.println("Country         : " + locale.getCountry());
		System.out.println("DisplayLanguage : " + locale.getDisplayLanguage());
		System.out.println("DisplayCountry  : " + locale.getDisplayCountry());
		System.out.println("locale : " + locale);
		Locale newLocale = new Locale("en", "US");
		Locale.setDefault(newLocale);
		locale = Locale.getDefault();
		System.out.println("Language        : " + locale.getLanguage());
		System.out.println("Country         : " + locale.getCountry());
		System.out.println("DisplayLanguage : " + locale.getDisplayLanguage());
		System.out.println("DisplayCountry  : " + locale.getDisplayCountry());
		System.out.println("locale : " + locale);          
	}
}
