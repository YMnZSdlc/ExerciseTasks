package Task;

public class Logic2 {


    public boolean makeBricks(int small, int big, int goal) {
        if (goal / 5 <= big && goal % 5 <= small)
            return true;
        else if (goal / 5 > big && goal - 5 * big <= small)
            return true;
        else return false;
    }

    public int loneSum(int a, int b, int c) {
        if (a==b && b==c) return 0;
        if (a==b) return c;
        if (b==c) return a;
        if (a==c) return b;
        return a+b+c;
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        else if (b==13) return a;
        else if (c ==13) return a+b;
        else return a+b+c;
    }


}
