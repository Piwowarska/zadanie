package pl.camp.it.rent.database;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Repository;
import pl.camp.it.rent.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDatabase {
    private final List<User> users =new ArrayList<>();



    public UserDatabase() {
        this.users.add(new User(
                "Karol",
                "Kowalski",
                "admin", DigestUtils.md5Hex("admin"),
                "kkowalski@gmail.com"));
        this.users.add(new User(
                "Kamil",
                "Nowak",
                "pasword",DigestUtils.md5Hex("password"),
                "knowak@gmail.com"));

    }

    public List<User> getUsers() {

        return users;
    }
    public User getUserByLogin(String login){
        for(User user:this.users){
            if(user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }
    public void addUser(User user){
        this.users.add(user);
    }

}
