package model;

import java.util.Random;

public class Car implements  Runnable{
    private String name;
    private double speed; // time (ms) per 1 km
    private Random random = new Random();

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 30; i++) {

                if (random.nextInt(100) < 10) {
                    throw new BrokenCarException("Xe " + name + " bị nổ lốp!");
                }
                long sleepTime = 100 + random.nextInt((int) speed - 99);
                Thread.sleep(sleepTime);
                System.out.println(name + ": Đã chạy được " + i + " km.");
            }

            System.out.println( name + " đã về đích!");

        } catch (BrokenCarException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
