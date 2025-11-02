
import Service.AuthService;
import Service.UserService;
import User.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("--- Menu Auth ---");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Chọn chức năng: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập username: ");
                    String username = sc.nextLine();
                    System.out.print("Nhập password: ");
                    String password = sc.nextLine();

                    User loggedUser = AuthService.login(username, password);
                    if (loggedUser != null) {
                        System.out.print("\nĐăng nhập thành công! Xin chào, " + loggedUser.getUsername());
                        boolean userExit = false;
                        while (!userExit) {
                            System.out.println("\nId của bạn là : " + loggedUser.getId());
                            System.out.println("--- Menu User ---");
                            System.out.println("1. Get user by id");
                            System.out.println("2. Get all user");
                            System.out.println("3. Change password");
                            System.out.println("4. Logout");
                            System.out.print("Chọn chức năng: ");
                            int userChoice = sc.nextInt();
                            sc.nextLine();

                            switch (userChoice) {
                                case 1:
                                    System.out.print(" Nhập ID : ");
                                    String id = sc.nextLine();
                                    User u = UserService.getUserById(id);
                                    if (u != null) {
                                        System.out.println("\n"+ u.toString());
                                    } else {
                                        System.out.println("Không tìm thấy user!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Danh sách người dùng:");
                                    for (User user : UserService.getAllUsers()) {
                                        System.out.println(user.toString());;
                                    }
                                    break;
                                case 3:
                                    System.out.print(" nhap id : ");
                                    String Id = sc.nextLine();
                                    User check = UserService.getUserById(Id);
                                    if (check != null) {
                                        System.out.print("Nhập mật khẩu moi: ");
                                        String NewPass = sc.nextLine();
                                        System.out.print("xấc nhận mật khẩu : ");
                                        String confirmpass = sc.nextLine();
                                        if (NewPass.equals(confirmpass)) {
                                            AuthService.changepassword(Id, NewPass, confirmpass);
                                        } else System.out.println(" Pass không khớp nhau ! ");
                                        ;
                                        break;
                                    }
                                    else {
                                        System.out.println("\n ID Erroll !");
                                        break;
                                    }
                                case 4:
                                    userExit = true;
                                    System.out.println("Đăng xuất thành công!");
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ!");
                            }
                        }
                    } else {
                        System.out.println("Sai tên đăng nhập hoặc mật khẩu!");
                    }
                    break;

                case 2:
                    System.out.println("--- Đăng ký tài khoản mới ---");
                    System.out.print("Nhập username: ");
                    String newUsername = sc.nextLine();
                    System.out.print("Nhập password: ");
                    String newPassword = sc.nextLine();
                    System.out.print("Nhập email: ");
                    String newEmail = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String newPhone = sc.nextLine();

                    User newUser = AuthService.register(newUsername, newPassword, newEmail, newPhone);
                    if (newUser != null) {
                        System.out.println("Đăng ký thành công! Tài khoản của bạn: " + newUser.getUsername());
                    } else {
                        System.out.println("Đăng ký thất bại! Vui lòng kiểm tra lại thông tin.");
                    }
                    break;

                case 3:
                    exit = true;
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
}