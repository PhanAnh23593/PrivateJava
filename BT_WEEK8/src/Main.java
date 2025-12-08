import model.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Xe Đỏ", 500);
        Car car2 = new Car("Xe Xanh", 600);
        Car car3 = new Car("Xe Vàng", 550);

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);

        System.out.println("=== BẮT ĐẦU CUỘC ĐUA! ===");

        t1.start();
        t2.start();
        t3.start();
    }
}