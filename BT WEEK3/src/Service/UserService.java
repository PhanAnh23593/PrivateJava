package Service;

import User.User;

import java.util.ArrayList;

public class UserService {
    private static ArrayList<User> users = new ArrayList<>();
    static {
        users.add(new User("Anh12345", "Anh12345@", "anh988998@gmail.com", "0334025592"));
        users.add(new User("Dung12345", "Anh12345@", "dugygy2323@gmail.com", "0364150049"));
        users.add(new User("Hong12345", "Anh12345@", "Hong1234@gmail.com", "0949235353"));
        users.add(new User("Hung12345", "Anh12345@", "Hung1234@gmail.com", "098765432"));
        users.add(new User("Binh1234", "Anh12345@", "hung9888998@gmail.com", "0334025592"));

    }
    public static ArrayList<User> getAllUsers(){
       return users;
    }


    public static User getUserById(String id){
        for (User u : users){
            if(u.getId().equals(id)){
                return u;
            }
        }
            return null;
    }
    public static void Adduser(User user){
        users.add(user);
    }
}

