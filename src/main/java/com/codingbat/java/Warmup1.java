package Task;

public class Warmup1 {
    public static void main(String[] args) {

        System.out.println("Task from Coding Bat JAVA");

        Warmup1 m = new Warmup1();
        System.out.println(m.sleepIn(true, false));

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) return true;
        else return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a == b) return (4 * a);
        else return (a + b);
    }

    public int diff21(int n) {
        int sum;
        if (n > 21) {
            sum = (n - 21) * 2;
            return sum;
        }
        sum = 21 - n;
        return sum;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) return true;
        else return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b) == 10) return true;
        return false;
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            if (a < 0 && b < 0) return true;
            else return false;
        } else if ((a > 0 && b < 0) || (a < 0 && b > 0)) return true;
        else return false;
    }

    public String notString(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("not")) return str;
        else return ("not " + str);
    }

    public String missingChar(String str, int n) {
        String start;
        String end;
        start = str.substring(0, n);

        end = str.substring(n + 1, str.length());

        return (start + end);


    }

    public String frontBack(String str) {
        String start, end, mid;
        if (str.length() < 2) return str;
        else {
            start = str.substring(0, 1);
            end = str.substring(str.length() - 1);
            mid = str.substring(1, str.length() - 1);
            return (end + mid + start);
        }
    }

    public String front3(String str) {
        String start;
        if (str.length() > 3) {
            start = str.substring(0, 3);
            return (start + start + start);
        } else {
            return (str + str + str);
        }
    }

    public String backAround(String str) {
        return (str.substring(str.length() - 1) + str + str.substring(str.length() - 1));
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        } else return false;
    }

    public String front22(String str) {
        if (str.length() > 2) return (str.substring(0, 2) + str + str.substring(0, 2));
        return (str + str + str);
    }

    public boolean startHi(String str) {
        if (str.substring(0, str.length() < 2 ? str.length() : 2).equals("hi")) return true;
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100) return true;
        return false;

    }

    public boolean in1020(int a, int b) {
        return (a <= 20 && a >= 10 || b <= 20 && b >= 10);

    }

    public boolean hasTeen(int a, int b, int c) {
        return (a <= 19 && a >= 13 || b <= 19 && b >= 13 || c <= 19 && c >= 13);
    }

    public boolean loneTeen(int a, int b) {
        boolean aB, bB;
        aB = (a <= 19 && a >= 13);
        bB = (b <= 19 && b >= 13);
        if (aB != bB) return true;
        else return false;
    }

    public String delDel(String str) {
        if (str.length() > 3 && str.substring(1, 4).equals("del")) {
            String begin = str.substring(0, 1);
            String end = str.substring(4);
            return (begin + end);
        }
        return str;

    }

    public boolean mixStart(String str) {
        return (str.length() >= 3 && str.substring(1, 3).equals("ix"));
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + 'o';
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + 'z';
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= c) return b;
        return c;
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) > Math.abs(10 - b)) return b;
        else if (Math.abs(10 - a) < Math.abs(10 - b)) return a;
        else return 0;
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) return true;
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) return true;
        return false;
    }

    public int max1020(int a, int b) {
        if (a >= b) {
            if (a >= 10 && a <= 20) return a;
            if (b >=10) return b;
        }else if (b>a){
            if (b >= 10 && b <= 20) return b;
            if (a >=10) return a;
        }
        return 0;
    }

    public boolean stringE(String str) {
        int charECounter = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)=='e'){
                charECounter++;
            }
        }
        if(charECounter>=1&&charECounter<=3) return true;
        else return false;
    }

    public boolean lastDigit(int a, int b) {
        if (a%10 == b%10)return true;
        return false;
    }

    public String endUp(String str) {
        String start, end;
        if (str.length()>3){
            start = str.substring(0,str.length()-3);
            end =  str.substring(str.length()-3).toUpperCase();
            return (start + end);
        }
        return str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result= "";
        for (int i = 0; i <str.length() ; i=i+n) {
            result = result + str.charAt(i);
        }
        return result;

    }

}


