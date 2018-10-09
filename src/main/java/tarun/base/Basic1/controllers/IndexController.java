package tarun.base.Basic1.controllers;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tarun.base.Basic1.domain.Symbol;

import javax.persistence.criteria.CriteriaBuilder;

//@Controller
@RestController
public class IndexController {

    // empty constructor
    public IndexController() {
    }

    @RequestMapping({"", "/", "/index"})
    //public Symbol getIndexPage(/**Model model*/){
    public Symbol getIndexPage(@RequestParam(value = "name", defaultValue = "World") String description){

        Symbol symbol = new Symbol();
        symbol.setTicker("MU");
        symbol.setDescription(description);
        //model.addAttribute("testval", "hello mr man are you ok?");

        return symbol;

    }

}
