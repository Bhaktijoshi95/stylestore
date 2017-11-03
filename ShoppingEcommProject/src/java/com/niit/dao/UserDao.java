
package com.niit.dao;

import com.niit.domain.User;
import java.util.List;


public interface UserDao {
    void save(User u);
    void delete(User u);
    List<User> list();
    void update();
        public User getUserByName(String email);

    
}
