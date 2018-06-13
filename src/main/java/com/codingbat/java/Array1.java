package Task;

public class Array1 {
    public static void main(String[] args) {

        Array1 m = new Array1();
        int[] a = {};
        int[] b = {1};
        int[] c = {2, 1};
        int[] d = {1, 3, 2};
        int[] e = {4, 2, 3, 1};

//        displayArray(m.makeEnds(a));
//        displayArray(m.makeLast(b));
//        displayArray(m.makeLast(c));
//        displayArray(m.makeLast(d));
//        displayArray(m.makeLast(e));
//
        System.out.println(m.unlucky1(a));
        System.out.println(m.unlucky1(b));
        System.out.println(m.unlucky1(c));
        System.out.println(m.unlucky1(d));
        System.out.println(m.unlucky1(e));

//        System.out.println(m.start1(b, c));
//        System.out.println(m.start1(a, c));
//        System.out.println(m.start1(a, b));
//        System.out.println(m.start1(b, d));
//        System.out.println(m.start1(d, d));


    }

    public void displayArray(int[] tab) {
        int a = 1;
        for (int i : tab) {
            System.out.print(i + (a < tab.length ? ", " : "\n"));
            a++;
        }
    }


    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) return true;
        else return false;
    }

    public int[] makePi() {
        int[] result = {3, 1, 4};
        return result;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    public boolean sameFirstLast(int[] nums) {
        return (nums.length > 0 && nums[0] == nums[nums.length - 1]);
    }

    public int sum3(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result + num;
        }
        return result;
    }

    public int[] rotateLeft3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[nums.length - 1] = nums[i];
            } else {
                result[i - 1] = nums[i];
            }
        }
        return result;
    }

    public int[] reverse3(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[nums.length - i - 1] = nums[i];
        }
        return result;
    }

    public int[] maxEnd3(int[] nums) {
        int[] result = new int[nums.length];
        if (nums[0] >= nums[nums.length - 1]) {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[0];
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[nums.length - 1];
            }
        }
        return result;
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        else if (nums.length == 1) return nums[0];
        else return (nums[0] + nums[1]);
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        return result;
    }

    public int[] makeEnds(int[] nums) {
        int[] result = new int[2];
        result[0] = nums[0];
        result[1] = nums[nums.length - 1];
        return result;
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3);
    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = 0;
        }
        return result;
    }

    public boolean double23(int[] nums) {
        if (nums.length > 1) {
            return (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3);
        } else return false;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
            return nums;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
            return nums;
        } else return nums;
    }

    public int start1(int[] a, int[] b) {
        int result = 0;
        if (a.length != 0 && a[0] == 1) {
            result += 1;
        }
        if (b.length != 0 && b[0] == 1) {
            result += 1;
        }
        return result;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int aTab = 0;
        int bTab = 0;
        aTab = a[0] + a[1];
        bTab = b[0] + b[1];
        if (aTab >= bTab) return a;
        else return b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] result = new int[2];
        result[0] = nums[nums.length / 2 - 1];
        result[1] = nums[nums.length / 2];
        return result;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int result[] = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }

    public int[] swapEnds(int[] nums) {
        int varOnBegin = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = varOnBegin;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[nums.length / 2 - 1];
        result[1] = nums[nums.length / 2];
        result[2] = nums[nums.length / 2 + 1];
        return result;
    }

    public int maxTriple(int[] nums) {
        if (nums[0] >= nums[nums.length / 2] && nums[0] >= nums[nums.length - 1]) return nums[0];
        else if (nums[nums.length / 2] >= nums[nums.length - 1]) return nums[nums.length / 2];
        else return nums[nums.length - 1];
    }

    public int[] frontPiece(int[] nums) {
        int[] result = new int[2];
        if (nums.length < 3) return nums;
        result[0] = nums[0];
        result[1] = nums[1];
        return result;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2) return false;
        else if (nums.length == 2) {
            if (nums[0] == 1 && nums[1] == 3) return true;
            return false;
        } else if (nums.length == 3) {
            if (nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) return true;
            return false;
        } else if (nums.length > 3) {
            if (nums[0] == 1 && nums[1] == 3 ||
                    nums[1] == 1 && nums[2] == 3 ||
                    nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) return true;
            else return false;
        } else return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];
            return result;
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
            return result;
        } else {
            result[0] = b[0];
            result[1] = b[1];
            return result;
        }
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length != 0 && b.length != 0) {
            int[] result = new int[2];
            result[0] = a[0];
            result[1] = b[0];
            return result;
        } else if (a.length ==0 && b.length!=0){
            int[] result = new int[1];
            result[0] = b[0];
            return result;
        } else if (a.length !=0 && b.length==0){
            int[] result = new int[1];
            result[0] = a[0];
            return result;
        } else {
            int[] result = new int[0];
            return result;
        }
    }


}
