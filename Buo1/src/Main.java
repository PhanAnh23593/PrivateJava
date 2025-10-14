import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhap ten cua ban : ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(" Nhao 2 so nguyen a va b : ");;
        System.out.print(" a= ");
        int a = sc.nextInt();
        System.out.print( " b = ");
        int b = sc.nextInt(); //hieloooo what yor nmwa
        System.out.println(" a + b = " + ( a+ b ));
        System.out.println(" a - b = " + ( a - b ));
        System.out.println(" a * b = " + ( a * b ));
        System.out.println(" a / b = " + ( a / b ));
        System.out.println(" a % b = " + ( a % b ));

        System.out.print(" Nhap vao tong sô giây ");
        long second = sc.nextLong();
        int hours = (int) (second / 3600);
        int minutes = (int) (second % 3600 / 60);
        int seconds = (int) (second % 60);
        System.out.println (hours + " hours " + minutes + " minutes " + seconds + " seconds");
        }
    }
