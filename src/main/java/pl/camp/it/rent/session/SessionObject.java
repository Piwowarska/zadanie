package pl.camp.it.rent.session;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

//singleton nie w aplikacji tylko w sesji
@Component
@SessionScope
public class SessionObject {
    private boolean logged=false;

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
