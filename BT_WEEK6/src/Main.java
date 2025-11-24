import constant.common;
import constant.errormessage;
import constant.successmessage;
import model.Book;
import service.impl.IBookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IBookServiceImpl service = new IBookServiceImpl();

        while (true) {
            System.out.println(common.MENU);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Book newbook = service.Input_Book();
                    service.addBook(newbook);
                    break;
                case 2:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    Book b = service.getBookById(id);
                    if (b != null) b.displayInfo();
                    else System.out.println(errormessage.IDINVALLID);
                    break;
                case 3:
                    System.out.print("Chọn thể loại (TextBook/Novel): ");
                    String category = sc.nextLine();
                    for (Book book : service.getAllBooksByCategory(category)) {
                        book.displayInfo();
                    }
                    break;
                case 4:
                    for (Book c : service.getAllBooks()) c.displayInfo();
                    break;
                case 5:
                    System.out.print(common.INPUTIDDELTE);
                    String Id = sc.nextLine();
                    if (service.deleteBookById(Id)) System.out.println(successmessage.SUCCESSDELTE);
                    else System.out.println(errormessage.IDINVALLID);
                    break;
                case 6:
                    System.out.println( common.SUMBINARY + service.calculateTotalValue());
                    break;
                case 7:
                    System.out.println(common.EXIT_PROGRAMM);
                    return;
                default:
                    System.out.println(errormessage.INVALID_CHONCE);
                    break;
            }
        }
    }
}