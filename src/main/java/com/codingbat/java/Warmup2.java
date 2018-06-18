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

    int countXX(String str) {
        int index = 1;
        int counter = 0;
        while (index < str.length()) {
            if (str.substring(index - 1, index + 1).equals("xx")) {
                counter++;
            }
            index++;
        }
        return counter;
    }

    //    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (str.charAt(i+1)=='x'){
            return true;
        }else {
            return false;
        }


    }


}
