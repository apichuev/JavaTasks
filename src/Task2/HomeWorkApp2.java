package Task2;

public class HomeWorkApp2 {
    public static void main(String [] args){
        Summ(10,2);
        System.out.println(Within10And20(1, 2));
        isPositiveOrNegative(13);
        System.out.println(isNegative(-48));
        printWordNTimes("Example",12);
    }
    public static int Summ(int a, int b) {
        final int i = a + b;
        if (i >= 10 && i <= 20) {
            System.out.println("true");
        } else { System.out.println("false");
            }
        return i;
    }
    static boolean Within10And20(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else { return false;
            }
    }

    static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным");
        } else { System.out.println("Число " + a + " является отрицательным");
            }
    }

    static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else { return false;
        }
    }

    public static void printWordNTimes(String word, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(word);
        }
    }

}