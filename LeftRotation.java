
import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int [] b = new int[a.length];
        
        for (int i = 0 ; i < b.length ; i = i + 1) {
            b[(i + Math.abs(a.length - k))%a.length] = a[i];
        } 
        
        for(int i : b) {
            System.out.print(i + " ");
        }
    }
}
