
package com.miportfolioapp.SpringBoot.service;

import com.miportfolioapp.SpringBoot.model.User;
import com.miportfolioapp.SpringBoot.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository persoRepo;
    
    @Override
    public List<User> verUsers() {
        return persoRepo.findAll();
    }

    @Override
    public void crearUser(User per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarUser(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public User buscarUser(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
