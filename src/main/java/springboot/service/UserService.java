package springboot.service;

import springboot.model.User;
import springboot.repository.UserRepository;

import java.util.List;

public interface UserService {

    User findById(Long id);


    List<User> findAll();

    User saveUser(User user);


    void deleteById(Long id);
}
