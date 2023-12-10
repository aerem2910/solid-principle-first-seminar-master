package homework;

public class DatabasePersister implements Persister {
    @Override
    public void save(User user) {
        System.out.println("Save user to database: " + user.getName());
    }
}
