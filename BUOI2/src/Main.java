
public class Main {
    public static final long MAX = 1000000000;
    public static boolean[] check = new boolean[100];

    public static void main(String[] args) {
        int[] arr = new int[40];
        long sum = 0;
        long tich = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            sum += arr[i];
            tich *= arr[i];
        }
        System.out.println(" Tich cua mang nay la : " + tich);
        System.out.println(" Tong cua mang nay la : " + sum);
        Sangnguyento(100);
        System.out.println(" Cac so ngyen to la : ");
        for (int i = 1; i < arr.length; i++) {
            if (check[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Sangnguyento(int n) {
        check[1] = true;
        for (int i = 2; i < n; i++) {
            check[i] = true;
        }
        for (int i = 2; i < n; i++) {
            if (check[i] == true) {
                for (int j = i * i; j < n; j += i) {
                    check[j] = false;
                }
            }
        }
    }
}


//1.equals(2) so sanh co hoa.
//3.equalsIgnoreCase(4)  so sanh khong hoa .