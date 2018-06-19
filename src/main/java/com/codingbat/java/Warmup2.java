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

    //Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (str.length() <= i + 1) {
            return false;
        } else if (str.charAt(i + 1) == 'x') {
            return true;
        } else {
            return false;
        }
    }

    //Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    public String stringBits(String str) {
        if (str.length()<1){
            return "";
        }else if (str.length()<2){
            return str;
        } else {
            return str.charAt(0) + stringBits(str.substring(2));
        }
    }

    //Given a non-empty string like "Code" return a string like "CCoCodCode".
    public String stringSplosion(String str) {
        if (str.length()<2)return str;
        return stringSplosion(str.substring(0,str.length()-1))+str;
    }


}
