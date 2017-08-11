import java.util.Scanner;

public class Solutions {

    static int saveThePrisoner(int pCount, int sweetCount, int startID) {
        return ((sweetCount + startID - 2) % pCount + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
    }
}
