import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lượng phần tử của mảng : ");
        int n = sc.nextInt();
        int [] a = new int[n];
        Utils.Input_Arr(a,n);
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
                    Utils.Sum(a);
                    break;
                case 2:
                    Utils.MaxMin(a);
                    break;
                case 3:
                    Utils.Sortarr(a);
                    break;
                case 4:
                    Utils.Primemax(a);
                    break;
                case 5:
                    break;
            }
        }
    }
}