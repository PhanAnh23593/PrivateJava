package Service;

import User.User;

import java.util.ArrayList;


public class AuthService {
    static ArrayList<User>  Users = UserService.getAllUsers();
    public static boolean CheckUseNamer(String username) {
        boolean checkusername1 = false;
        boolean checkusername2 = false;
        for (User c : Users){
            if (c.getUsername().equals(username)){
                checkusername2 = true;
            }
        }

        for(int i=0;i<username.length();i++){
            if(!Character.isLetterOrDigit(username.charAt(i))){
                checkusername1 = true;
            }
        }

        if(username.contains(" ") || username.length() < 6  || checkusername1 || checkusername2) {
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean CheckUsePassword(String password) {
        boolean checkpassword1 = false;
        boolean checkpassword2 = false;
        boolean checkpassword3 = false;
        boolean checkpassword4 = false;
        boolean checkpassword = false;
        for(int i=0;i<password.length();i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                checkpassword1 = true;
            }
            if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                checkpassword2 = true;
            }
            if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                checkpassword3 = true;
            }
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                checkpassword4 = true;
            }
        }

        if(checkpassword1 && checkpassword2 && checkpassword3 && checkpassword4){
            checkpassword = true;
        }
        if(password.contains(" ") || !checkpassword || password.length() < 6  ) {
            return false;
        }
         else return true;

    }
    public static boolean CheckUseEmail(String email) {
        boolean checkemail1 = false;
        boolean checkemail2 = false;
        int dem = 0,vt = 0;
        for(int i=1;i<email.length()-1;i++){
            if(email.charAt(i) == '@'){
                checkemail1 = true;
                dem++;
                vt = i;
            }
        }
        if(dem>=2){
            checkemail1 = false;
        }
        for(int j = vt ;j<email.length();j++){
            if(email.charAt(j) == '.') {
                checkemail2 = true;
            }
        }
        if(checkemail1 && checkemail2 ){
            return true;
        }
         else return false;
    }


    public static boolean CheckUsePhone(String phone) {
        boolean checkphone = false;
        for(int i=0;i<phone.length();i++){
            if(phone.charAt(i) < '0' || phone.charAt(i) > '9'){
                checkphone = true;
                break;
            }
        }
        if(!checkphone && (phone.length()>=9  && phone.length()<=10) && phone.charAt(0)=='0' ){
            return true;
        }
         else return false;
    }

    public static User login(String username,String password){
        for(User check : Users){
            if(check.getUsername().equals(username) && check.getPassword().equals(password)){
                return check;
            }
        }
        return null;
    }
    public static User register(String username,String password,String email,String phone) {
        if(!CheckUseNamer(username) || !CheckUseEmail(email) || !CheckUsePhone(phone) || !CheckUsePassword(password)){
            return null;
        }
        User adduser = new User(username,password,email,phone);
        UserService.Adduser(adduser);
        return adduser;
    }
    public static void changepassword(String id,String newpassword,String confirmpassword){
        if(!CheckUsePassword(newpassword) || !CheckUsePassword(confirmpassword)){
        System.out.println(" Mật khẩu mới không hợp lệ ! ");
        return;
         }
         else{
        for (User c :  Users) {
            if (c.getId().equals(id)) {
                c.setPassword(newpassword);
                System.out.println(" Đổi pass thàdnh công");
                }
            }
        }
    }
}
