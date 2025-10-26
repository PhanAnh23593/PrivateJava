import java.util.Scanner;

public  class Utils {
    static final int MAXIMUM = 10000;
    public static void Input_Arr(int[] a, int n ){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
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
