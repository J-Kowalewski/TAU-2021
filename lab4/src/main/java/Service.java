import java.util.List;

public class Service {
    private Database database;

    public Service(Database database){
        this.database = database;
    }

    public boolean query(String query) {
        return database.isAvailable();
    }

    public User returnlUser(int x){
        return database.users.get(x);
    }

    @Override
    public String toString() {
        return "Using database with id: "+ database.getUniqueId();
    }
}
