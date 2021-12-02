package pl.camp.it.rent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.camp.it.rent.model.view.RgisterUser;
import pl.camp.it.rent.services.AuthenticationService;
import pl.camp.it.rent.session.SessionObject;
import pl.camp.it.rent.validators.Validator;

import javax.annotation.Resource;

@Controller
public class AuthenticationController {


    @Autowired
    AuthenticationService authenticationService;

    //wstrzykniecie jak przyjdzie zadanie z przegladarki
    @Resource
    SessionObject sessionObject;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm(Model model) {
        model.addAttribute("logged", this.sessionObject.isLogged());
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@RequestParam String login, @RequestParam String password) {
        //walidacja

        if(!Validator.validateLogin(login) || !Validator.validatePassword(password)){
            return "redirect:/login";
        }
        this.authenticationService.authenticate(login, password);
        if (this.sessionObject.isLogged()) {
            return "redirect:/main";
        } else {
            return "redirect:/login";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        this.authenticationService.logout();
        return "redirect:/main";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String zaloguj(Model model) {
        model.addAttribute("logged", this.sessionObject.isLogged());
        model.addAttribute("registerUser", new RgisterUser());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute RgisterUser registerUser) {
        //walidacja
        if(!Validator.validateLogin(registerUser.getLogin())||
                !Validator.validatePassword(registerUser.getPassword())||
                !registerUser.getPassword().equals(registerUser.getPassword2())||
                !Validator.validateName(registerUser.getName())||
                !Validator.validateSurname(registerUser.getSurname())||
                !Validator.validateMail(registerUser.getMail())){
            return "redirect:/register";
        }
        if (this.authenticationService.register(registerUser)) {
            return "redirect:/login";
        } else {
            return "redirect:/register";
        }
    }



}
