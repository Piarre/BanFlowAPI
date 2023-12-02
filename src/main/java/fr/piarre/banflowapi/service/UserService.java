package fr.piarre.banflowapi.service;

import fr.piarre.banflowapi.model.Kanban;
import fr.piarre.banflowapi.model.Role;
import fr.piarre.banflowapi.model.User;
import fr.piarre.banflowapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String CreateUser(User user) {
        user.setRole(Role.USER);
        userRepository.save(user);
        return "User created";
    }

    public String DeleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted";
    }

    public User GetUser(Long id) {
        return userRepository.findById(id).get();
    }

}
