import java.util.Scanner;

public class Main {
    static final int MAXIMUM = 10000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lượng phần tử của mảng : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int x=7;
        while(x!=5 ) {
            System.out.println(" Hãy nhập câu lệnh : ");
            System.out.println("--- Menu ---");
            System.out.println("1. Tính tổng các phẩn tử trong mảng  ");
            System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng ");
            System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần  ");
            System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra :Không có ");
            System.out.println("5. Dừng lại . ");
            System.out.println("Nhập lựa chọn: ");
            x=sc.nextInt();
            switch (x){
                case 1:
                    Sum(a);
                    break;
                case 2:
                    MaxMin(a);
                    break;
                case 3:
                    Sortarr(a);
                    break;
                case 4:
                    Primemax(a);
                    break;
                case 5:
                    break;
            }
        }
    }
    public static void Sum(int [] a){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        System.out.println(" Trong của các phần tử trong mảng là : " + sum);
    }
    public static void MaxMin(int [] a){
        int min = a[0];
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            else if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(" MAX = " + max);
        System.out.println(" MIN = " + min);
    }
    public static void Sortarr(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int x : a){
            System.out.println(x);
        }
    }
    static boolean [] check = new boolean[MAXIMUM];
    public static void CheckPrimes( int MAXIMUM){
        check[0]= false;
        check[1] = false;
        for(int i=2;i<MAXIMUM;i++){
            check[i]=true;
        }
        for(int i=2;i<MAXIMUM;i++){
            if(check[i]==true){
                for(int j=i*i;j<MAXIMUM;j+=i){
                    check[j]=false;
                }
            }
        }
    }
    public static void Primemax(int[] a){
        CheckPrimes(MAXIMUM);
        int maxprime = 0;
        boolean tmp = false;
        for(int i=0;i<a.length;i++){
            if(check[a[i]] ){
                maxprime = a[i];
                tmp = true;
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            if(check[a[i]]==true && a[i] > maxprime){
                maxprime = a[i];
            }
        }
        if(tmp==false){
            System.out.println(" Không có : ");
        }
        else{
            System.out.println(" Số Nguyên tố lớn nhát trong mảng là : "+ maxprime);
        }
    }
}