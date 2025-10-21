import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }

        out_arr(s);
        nguocarr(s);
    }
    public static void out_arr(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void nguocarr(String[] a){
        for(int i=a.length-1;i>=0;i--) {
            System.out.print(a[i]);
        }
    }
}
