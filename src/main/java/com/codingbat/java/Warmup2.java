package Task;

public class Warmup2 {

    public static void main(String[] args) {

    }

    public String stringTimes(String str, int n) {
        String strFinal = "";
        for (int i = 0; i < n; i++) {
            strFinal = strFinal + str;
        }
        ;
        return strFinal;
    }

    public String frontTimes(String str, int n) {
        String copy = "";
        String wynik = "";
        if (str.length() > 3) {
            copy = str.substring(0, 3);
        } else copy = str;
        for (int i = 0; i < n; i++) {
            wynik = wynik + copy;
        }
        return wynik;
    }

/*
    public  int countXX(String str) {

    }
*/


}
