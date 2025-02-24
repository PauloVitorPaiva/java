package quaulaex;

//import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        System.out.print("your language is");
        //System.out.println(Locale.getDefault().getLanguage());
        System.out.println(System.getProperty("user.language"));
    }
}
