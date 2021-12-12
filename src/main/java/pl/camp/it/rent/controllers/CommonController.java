package pl.camp.it.rent.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.camp.it.rent.database.TaleDatabase;
import pl.camp.it.rent.session.SessionObject;
import pl.camp.it.rent.session.TaleService;

import javax.annotation.Resource;

@Controller
public class CommonController {

    @Autowired
    TaleService taleService;



    @Resource
    SessionObject sessionObject;

    @RequestMapping(value = "/",method =RequestMethod.GET)
    public String main(){
        return "redirect:/main";
    }
/*
    @RequestMapping(value="/main",method = RequestMethod.GET)
    public String main(Model model){
        model.addAttribute("tales",this.taleService.gestAllTale());
        model.addAttribute("logged",this.sessionObject.isLogged());
        return"main";
    }

 */
    /*
    @RequestMapping(value = "/contact",method =RequestMethod.GET)
    public String contact(Model model)
    { model.addAttribute("logged",this.sessionObject.isLogged());
        return"contact";
    }

     */



 @RequestMapping(value="/student",method = RequestMethod.GET)
    public String student(){
       return"student";
    }
    @RequestMapping(value = "/nauczyciel",method =RequestMethod.GET)
    public String nauczyciel() {

        return "nauczyciel";
    }
}
