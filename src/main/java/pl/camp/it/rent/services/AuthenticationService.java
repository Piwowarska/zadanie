package pl.camp.it.rent.services;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.camp.it.rent.database.UserDatabase;
import pl.camp.it.rent.model.User;
import pl.camp.it.rent.model.view.RgisterUser;
import pl.camp.it.rent.session.SessionObject;

import javax.annotation.Resource;

@Service
public class AuthenticationService {

    @Autowired
    UserDatabase userDatabase;

    @Resource
    SessionObject sessionObject;

    public void authenticate(String login, String password) {
        User user1 = this.userDatabase.getUserByLogin(login);
        if (user1 != null && user1.getPassword().equals(DigestUtils.md5Hex(password))) {
            this.sessionObject.setLogged(true);

        }


    }

    public void logout() {
        this.sessionObject.setLogged(false);
    }

    public Boolean register(RgisterUser rgisterUser) {
        if (this.userDatabase.getUserByLogin(rgisterUser.getLogin()) == null) {
            rgisterUser.setPassword(DigestUtils.md5Hex(rgisterUser.getPassword()));
            this.userDatabase.addUser(rgisterUser);
            return true;

        }
        return false;
    }
}

