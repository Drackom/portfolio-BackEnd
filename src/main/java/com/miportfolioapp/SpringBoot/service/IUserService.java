
package com.miportfolioapp.SpringBoot.service;

import com.miportfolioapp.SpringBoot.model.User;
import java.util.List;

public interface IUserService {
    
    public List<User> verUsers ();
    
    public void crearUser (User per);
    
    public void borrarUser (Long id);
    
    public User buscarUser (Long id);
    
}
