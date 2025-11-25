import constant.errormessage;
import constant.message;
import constant.successmessage;
import service.IEmployeeService;
import service.impl.IEmployeeServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IEmployeeServiceImpl service = new IEmployeeServiceImpl();

        while (true) {
            System.out.println(message.MENU);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println(message.LISTEMPLOYEE);
                    System.out.println(service.getEmployees());
                    break;
                case 2:
                    System.out.println(message.INPUT_ID);
                    String id = sc.nextLine();
                    if(service.getEmployeeByID(id) != null) {
                        System.out.println(service.getEmployeeByID(id));
                    }
                    else {
                        System.out.println(errormessage.INVALLIDID);
                    }
                    break;
                case 3:
                    System.out.println(message.INPUT_NAME);
                    String name = sc.nextLine();
                    if(service.getEmployeeByName(name) != null) {
                        System.out.println(service.getEmployeeByName(name));
                    }
                    else {
                        System.out.println(errormessage.INVALLIDNAME);
                    }
                    break;

                case 4:
                    System.out.println(message.EXIT_PROGRAMM);
                    return;
                default:
                    System.out.println(errormessage.INVALID_CHONCE);
                    break;
            }
        }
    }
}