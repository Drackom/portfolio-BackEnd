
package com.miportfolioapp.SpringBoot.controller;
import com.miportfolioapp.SpringBoot.model.User;
import com.miportfolioapp.SpringBoot.service.IUserService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IUserService persoServ;
    
    @PostMapping ("/new/user")
    public void agregarUser (@RequestBody User pers) {
        persoServ.crearUser(pers);
    }
    
    @CrossOrigin(origins = "https://miportfolio-3f72c.web.app/iniciar-sesion")
    @GetMapping ("/ver/users")
    @ResponseBody
    public List<User> verUsers () {
        return persoServ.verUsers();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarUser (@PathVariable Long id) {
        persoServ.borrarUser(id);
    }
    
}
