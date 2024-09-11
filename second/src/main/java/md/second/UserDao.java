package md.second;

import md.first.User;

import java.util.*;

public final class UserDao
{
    private final Map<Integer, User> users = new HashMap<>();

    public Optional<User> findById(int id)
    {
        return Optional.ofNullable(users.get(id));
    }

    public List<User> findAll()
    {
        return new ArrayList<>(users.values());
    }
}
