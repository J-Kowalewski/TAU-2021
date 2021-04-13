import java.util.List;

public class Database {

    List<User> users;

    public boolean isAvailable(){
        return false;
    }
    public int getUniqueId() {
        return 42;
    }
    public void addUser(User user){
        users.add(user);
    }
}
