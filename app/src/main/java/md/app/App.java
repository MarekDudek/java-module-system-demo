package md.app;

import md.user.User;
import md.userdao.UserDao;

import static java.lang.System.err;
import static java.lang.System.out;

public class App
{

    public static void main(String[] args)
    {
        out.println("Start");
        User user = new User("Marek", "secret");
        var dao = new UserDao();
        var id = dao.save(user);
        var found = dao.findById(id);
        if (found.isEmpty())
        {
            err.println("User not found");
            System.exit(1);
        }
        user = found.get();
        dao.delete(user);
        found = dao.findById(id);
        if (found.isPresent())
        {
            err.println("User found");
            System.exit(1);
        }
        out.println("Stop");
    }
}
