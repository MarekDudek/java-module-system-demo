package md.userdao;

import md.user.User;
import md.dao.Dao;

import java.util.*;

public final class UserDao implements Dao<User>
{
    private final Map<UUID, User> users = new HashMap<>();

    @Override
    public Optional<User> findById(UUID id)
    {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll()
    {
        return new ArrayList<>(users.values());
    }

    @Override
    public UUID save(User user)
    {
        var id = UUID.randomUUID();
        users.put(id, user);
        return id;
    }

    @Override
    public void delete(User user)
    {
        users.values().remove(user);
    }
}
