package home.springboot2.web.dao;

import home.springboot2.web.model.User;

import java.util.List;

public interface UserDAO {

    void add(User user);

    void update(User user);

    void remove(long id);

    User getById( long id);

    List<User> listUsers();

    User getByFirstName( String firstname);
}
